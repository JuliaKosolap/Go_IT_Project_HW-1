package Module9;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    transient static int INITIAL_CAPACITY = 4;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    final float loadFactor;
    transient Node<K, V>[] table;
    private transient int entriesCount;

    public MyHashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public void put(Object key, Object value) {
        Node<K, V> node = new Node<K, V>(hash(key), (K) key, (V) value, null);
        if (table == null) {
            table = new Node[INITIAL_CAPACITY];
        }
        if (table.length > 0) {
            if (entriesCount >= (INITIAL_CAPACITY * loadFactor)) {
                resize();
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (i == hash(key) && table[i] == null) {
                table[hash(key)] = node;
                entriesCount++;
            } else if (table[i] != null) {
                Node<K, V> x = table[i];
                if (i == hash(key) && table[i].key.equals(key)) {
                    table[hash(key)] = node;
                } else if (i == hash(key) && !table[i].key.equals(key)) {
                    while (x.next != null) {
                        x = x.next;
                    }
                    x.next = node;
                }
            }
        }
    }

    public void remove(Object key, Object value) {
        if (table.length > 0) {
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    if (table[i].key.equals(key) && table[i].value.equals(value)) {
                        if (i != 0 && table[i - 1] != null) {
                            table[i - 1].next = null;
                        }
                        table[i] = null;
                        entriesCount--;
                    }
                }

            }

        }
    }

    public void clear() {
        if (table.length > 0) {
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    table[i] = null;
                }
            }
        }
    }


    public int size() {
        return this.entriesCount;
    }


    public V get(Object key) {
        if (table.length > 0) {
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    Node<K, V> x = table[i];
                    if (table[i].key.equals(key)) {
                        return table[i].value;
                    }
                        else{
                            while (x.next != null) {
                                x = x.next;
                                if(x.key.equals(key))  {
                                    return x.value;
                                }
                        }
                    }
                }
            }
        }
        return null;
    }

    public void resize() {
        int newCapacity = INITIAL_CAPACITY * 2;
        Node<K, V>[] newTable = new Node[newCapacity];
        INITIAL_CAPACITY = newCapacity;
        Node<K, V>[] oldTable = table;
        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null) {
                K key = oldTable[i].key;
                int newHash = hash(key);
                oldTable[i].hash = newHash;
                for (int j = 0; j < newTable.length; j++) {
                    if (j == newHash) {
                        newTable[j] = oldTable[i];
                        if (hash(key) < INITIAL_CAPACITY - 1 && newTable[j + 1] != null) {
                            newTable[j].next = newTable[j + 1];
                        }
                    }
                }
            }

        }
        table = newTable;
    }

    public static int hash(Object key) {
        if (key != null) {
            int hash = key.hashCode();
            return hash & (INITIAL_CAPACITY - 1);
        }
        return 0;


    }

    private class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
