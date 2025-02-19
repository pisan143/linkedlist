
import java.util.Iterator;

class ListIterator implements Iterator {

    Node current;

    // initialize pointer to head of the list for iteration
    public ListIterator(LinkedList list) {
        current = list.head;
    }

    // returns false if next element does not exist
    @Override
    public boolean hasNext() {
        return current != null;
    }

    // return current data and update pointer
    @Override
    public Node next() {
        if (current == null) {
            return null;
        }
        current = current.nextNode;
        return current;
    }

}
