package HomeworkWeek11.Problem3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StringsConsumer implements Runnable{
    private BlockingQueue<String> queue;

    public StringsConsumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
           while(true) {
               String word = queue.take();
               String method = queue.take();
               consume(word, method);

               if(queue.remainingCapacity()>0) {
                   System.out.println("\nQueue size: " + queue.size() + ", remaining capacity: " + queue.remainingCapacity());
               }else{
                   System.out.println("\nFull queue");
               }

               Thread.sleep(500);
           }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void consume(String word, String method) {
        StringsProcessorImplementations sp = new StringsProcessorImplementations(word);
        System.out.print(" --> method applied: " + method + " --> result: ");

        switch (method) {
            case "StringsPrinter":
                sp.StringsPrinter();
                break;
            case "VowelsCounter":
                sp.VowelsCounter();
                break;
            case "ConsonantsCounter":
                sp.ConsonantsCounter();
                break;
            case "StringsLength":
                sp.StringsLength();
                break;
            case "VowelsRemover":
                sp.VowelsRemover();
        }
    }
}
