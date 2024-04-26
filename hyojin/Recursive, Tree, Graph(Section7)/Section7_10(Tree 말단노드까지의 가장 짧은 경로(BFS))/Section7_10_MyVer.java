package Section7_10;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int date;
    Node lt, rt;

    public Node(int val) {
        this.date = val;
        this.lt = this.rt = null;
    }
}

public class Section7_10_MyVer {

    static public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                } else {
                    q.offer(cur.lt);
                    q.offer(cur.rt);
                }

            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
