import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.lt = this.rt = null;
    }
}

public class Section7_7_Ver1 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            System.out.print(level + " : ");
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node curNode = queue.poll();
                System.out.print(curNode.data + " ");
                if (curNode.lt != null) queue.offer(curNode.lt);
                if (curNode.rt != null) queue.offer(curNode.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Section7_7_Ver1 tree = new Section7_7_Ver1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
