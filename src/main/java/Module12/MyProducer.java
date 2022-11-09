package Module12;

import java.util.concurrent.BlockingQueue;

public class MyProducer implements Runnable {
    public BlockingQueue<String> queue;
    int index = 0;


    MyProducer(BlockingQueue<String> queue) {
        this.queue = queue;

    }

    @Override
    public void run() {
        try {
            queue.put("notification #" + index);
            index++;
            System.out.println("Passed: " + index + " seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
