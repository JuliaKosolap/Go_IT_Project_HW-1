package Module9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(2, "two two");
        map.put(3, "three");
        map.put(11, "11");
        map.put(21, "21");
        map.put(100, "100");
        map.put(101, "101");
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.get(101));



    }
}
