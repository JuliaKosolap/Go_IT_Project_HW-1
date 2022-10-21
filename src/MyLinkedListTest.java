import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        System.out.println(list.size());
        list.add("hello");
        list.add("world");
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.add("hello");
        list.add("world");
        System.out.println(list.size);
        list.clear();
        System.out.println(list.size);
        System.out.println(list.get(0));
    }
}
