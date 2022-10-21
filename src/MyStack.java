import java.util.Arrays;

public class MyStack<E> {
    transient Object[] currentList = {};
    private int size = 0;


    public int size() {
        return size;
    }

    public void push(E value) {
        E[] array = (E[]) Arrays.copyOf(currentList, currentList.length + 1);
        array[array.length - 1] = value;
        size = size + 1;
        currentList = array;
    }

    private Object[] reverseList(Object[] array) {
        Object[] reversedList = new Object[array.length];
        int y = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedList[y] = array[i];
            y++;
        }

        return reversedList;
    }
    public void remove(int index) {
        if (currentList.length > 0) {
        Object[] reversedList = reverseList(currentList);
        int y = 0;
            Object[] array = new Object[reversedList.length - 1];
            for (int i = 0; i < reversedList.length; i++) {
                if (i != index) {
                    array[y] = reversedList[i];
                    y++;
                }
            }
            currentList = reverseList(array);
            size = size - 1;
            }
    }

    public E peek() {
        Object[] array = reverseList(currentList);
        return (E) array[0];
    }

    public E pop() {
        E element = null;
        if (currentList.length > 0) {
            Object[] array = reverseList(currentList);
            element = (E) array[0];
            int y = 0;
            Object[] temp = new Object[currentList.length - 1];
            for (int i = 1; i < array.length; i++) {
                temp[y] = array[i];
                y++;
            }
            currentList = reverseList(temp);
            size = size - 1;
        }

        return element;
    }

    public void clear() {
        currentList = new Object[] {};
        size = 0;
    }
}
