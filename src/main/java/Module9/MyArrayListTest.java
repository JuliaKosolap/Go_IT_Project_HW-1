package Module9;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        System.out.println(list.size());
        list.add(8);
        list.add(12);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.clear();
        System.out.println(list.size());

    }
}
