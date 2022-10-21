package Module9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();
        System.out.println(queue.size());
        queue.add("Pasha");
        queue.add("Sasha");
        queue.add("Sergey");
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());


    }
}
