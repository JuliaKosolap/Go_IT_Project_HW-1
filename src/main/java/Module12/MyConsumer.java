package Module12;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class MyConsumer implements Runnable {
    public BlockingQueue<String> queue;

    MyConsumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("5 seconds passed");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
