
public class Driver {

    public static void main(String[] args) {
        // LinkedList<Integer> ml = new LinkedList<>();
        // ml.add(10);
        // ml.add(20);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;

        System.out.println(n1);
        System.out.println(n2);

        Node curr = n1;
        while (curr != null) {
            System.out.print(curr);
            curr = curr.nextNode;
        }
        System.out.println("\nNow with a linked list");
        LinkedList ml = new LinkedList();
        ml.addToEnd(10);
        ml.addToEnd(100);
        ml.addToEnd(200);
        ml.addToEnd(5);
        System.out.println(ml);
        System.out.println("\nAdd to beginning");
        ml.addToBeginning(-7);
        ml.addToBeginning(42);
        System.out.println(ml);
        System.out.println("Size is " + ml.size());
        System.out.println("Contains -7? " + ml.contains(-7));
        System.out.println("Contains 13? " + ml.contains(13));
        int[] asArray = ml.toArray();
        // print array
        System.out.println("As an int array:");
        for (int num : asArray) {
            System.out.print(num + ",");
        }
        for (Node x : ml) {
            System.out.println(x + ",");
        }
        System.out.println();
        ml.removeItem(200);
        System.out.println("After remove 200: " + ml);
        ml.removeItem(42);
        System.out.println("After remove 42: " + ml);
        ml.removeItem(4222);
        System.out.println("After remove 4222: " + ml);
        ml.clear();
        ml.removeItem(-5);
        System.out.println("After clear: " + ml);
        System.out.println("Should be empty: " + ml);
    }

}
