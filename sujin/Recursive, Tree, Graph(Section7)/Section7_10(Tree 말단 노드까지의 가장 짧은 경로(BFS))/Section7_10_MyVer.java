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

public class Section7_10_MyVer {
    Node root;

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null) return level;
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Section7_10_MyVer T = new Section7_10_MyVer();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
//        T.root.rt.lt = new Node(6);
        System.out.println(T.BFS(T.root));
    }
}
