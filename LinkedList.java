
import java.util.Iterator;

public class LinkedList implements Iterable<Node> {

    @Override
    public Iterator<Node> iterator() {
        return new ListIterator(this);
    }
    Node head = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    private Node findNode(int x) {
        Node[] toRemoveAndPre = findNodeWithPrevious(x);
        if (toRemoveAndPre != null) {
            return toRemoveAndPre[0];
        }
        return null;
    }

    private Node[] findNodeWithPrevious(int x) {
        Node curr = head;
        Node previous = null;
        while (curr != null) {
            if (curr.data == x) {
                return new Node[]{curr, previous};
            }
            previous = curr;
            curr = curr.nextNode;
        }
        return null;
    }

    public boolean contains(int x) {
        return findNode(x) != null;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        Node curr = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = curr.data;
            curr = curr.nextNode;
        }
        return arr;
    }

    // 1. head is null
    // 2. head is the one we want to remove
    // 3. x is somewhere in the list
    public boolean removeItem(int x) {
        Node[] toRemoveAndPre = findNodeWithPrevious(x);
        if (toRemoveAndPre == null) {
            return false;
        }
        Node toRemove = toRemoveAndPre[0];
        Node pre = toRemoveAndPre[1];
        size--;
        if (pre == null) {
            head = head.nextNode;
        } else {
            pre.nextNode = toRemove.nextNode;
        }
        return true;
    }

    public void addToBeginning(int x) {
        size++;
        Node n = new Node(x);
        n.nextNode = head;
        head = n;
    }

    public void addToEnd(int x) {
        size++;
        Node n = new Node(x);
        if (head == null) {
            head = n;
            return;
        }
        // go to last node
        Node curr = head;
        while (curr.nextNode != null) { // I am not at the last Node
            curr = curr.nextNode;
        }
        curr.nextNode = n;
    }

    @Override
    public String toString() {
        String out = "{";
        Node curr = head;
        while (curr != null) {
            out += curr.toString();
            out += "-->";
            curr = curr.nextNode;
        }
        out += "null}";
        return out;
    }
}
