package Module12;

import java.util.concurrent.*;

public class TaskOneTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> queue = new LinkedBlockingDeque<>();
        MyProducer producer = new MyProducer(queue);
        MyConsumer consumer = new MyConsumer(queue);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(producer, 1, 1, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(consumer, 5, 5, TimeUnit.SECONDS);

        Thread.sleep(10000);
        executor.shutdown();
    }

}
