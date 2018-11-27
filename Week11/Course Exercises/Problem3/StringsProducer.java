package HomeworkWeek11.Problem3;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class StringsProducer implements Runnable{
    private BlockingQueue<String> queue;

    public StringsProducer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i=0;
        for( ; ;)
        {
            try {
                String word = ( new StringGenerator() ).generateString();
                System.out.print("String " + i + ": " + word);
                i++;
                queue.put(word);
                queue.put(chooseAlgorithm());

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public String chooseAlgorithm(){
        Random rand = new Random();
        List<String> strings = Arrays.asList("StringsPrinter","VowelsCounter","ConsonantsCounter","StringsLength","VowelsRemover");
        return strings.get(rand.nextInt(strings.size()));
    }
}
