import java.util.Arrays;

public class MyArrayList<E> {
    transient Object[] currentList = {};
    private int size = 0;


    public int size() {
        return size;
    }

    public void add(E value) {
        E[] array = (E[]) Arrays.copyOf(currentList, currentList.length + 1);
        array[array.length - 1] = value;
        size = size + 1;
        currentList = array;
    }

    public E get(int index) {
        E[] array = (E[]) currentList;
        return array[index];
    }

    public void remove(int index) {
        int y = 0;
        if (currentList.length > 0) {
            Object[] array = new Object[currentList.length - 1];
            for (int i = 0; i < currentList.length; i++) {
                if (i != index) {
                    array[y] = currentList[i];
                    y++;
                }
            }
            size = size - 1;
            currentList = array;
        }
    }

    public void clear() {
        currentList = new Object[] {};
        size = 0;
    }

}

