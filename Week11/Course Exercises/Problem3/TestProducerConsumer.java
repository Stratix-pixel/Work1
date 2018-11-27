package HomeworkWeek11.Problem3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        Thread stringsProducers = new Thread(new StringsProducer(queue));
        Thread stringsConsumers = new Thread(new StringsConsumer(queue));

        stringsProducers.start();
        stringsConsumers.start();
    }
}
