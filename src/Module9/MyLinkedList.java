package Module9;

public class MyLinkedList<E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    public int size() {
        return size;
    }

    //adds the new node to the end of the list
    public void add(Object value) {
        final Node<E> x = last;
        Node<E> newNode = new Node<E>(x, (E) value, null);
        last = newNode;
        if (x == null) {
            first = newNode;
        } else {
            x.next = newNode;
        }
        size++;
    }

    public void remove(int index) {

        Node<E> node = first;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            final MyLinkedList.Node<E> next = node.next;
            final MyLinkedList.Node<E> prev = node.prev;
            if (prev == null) {
                first = next;
            } else {
                prev.next = next;
                node.prev = null;
            }

            if (next == null) {
                last = prev;
            } else {
                next.prev = prev;
                node.next = null;
            }
            node.element = null;
            size--;
        }

    }

    public void clear() {
        for (MyLinkedList.Node<E> item = first; item != null; ) {
            MyLinkedList.Node<E> next = item.next;
            item.element = null;
            item.next = null;
            item.prev = null;
            item = next;
        }
        size = 0;

    }

    public E get(int index) {
        Node<E> node = first;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        if (node != null) {
            return node.element;
        } else return null;
    }


    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
