import java.util.Arrays;

public class MyQueue<E> {
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

    public E peek() {
        E[] array = (E[]) currentList;
        return array[0];
    }

    public E poll() {
        E[] array = (E[]) currentList;
        E element = array[0];
        int y = 0;
        if (currentList.length > 0) {
            Object[] temp = new Object[currentList.length - 1];
            for (int i = 1; i < currentList.length; i++) {
                    temp[y] = currentList[i];
                    y++;
                }
            size = size - 1;
            currentList = temp;
            }

        return element;
    }

    public void clear() {
        currentList = new Object[] {};
        size = 0;
    }
}
