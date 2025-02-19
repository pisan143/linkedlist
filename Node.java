
public class Node {

    public Integer data;
    public Node nextNode;

    public Node(Integer data) {
        this.data = data;
        this.nextNode = null;
    }

    public String toString() {
        String str = "";
        str += "[N:";
        str += data.toString();
        str += "]";
        return str;
    }
}
