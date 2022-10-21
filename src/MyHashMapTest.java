import java.util.HashMap;
import java.util.LinkedList;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("Linda Evans", "test1");
        map.put("Linda Fallow", "test2");
        map.put("Liza Bright", "test3");
        map.put("Sonya Bloom", "test6");
        map.put("Tom Taylor", "test4");
        map.put("Monica Belucchi", "test5");
        System.out.println(map.size());
        map.remove("Linda Fallow", "test2");
        System.out.println(map.size());
        System.out.println(map.get("Monica Belucchi"));
        System.out.println(map.get("Liza Bright"));
        map.clear();

    }
}
