package Section7_07;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Section7_07_Ver2 {
    Node root;

    public void BFS(Node root) {

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print("level "+L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Section7_07_Ver2 t = new Section7_07_Ver2();
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        t.root.rt.lt = new Node(6);
        t.root.rt.rt = new Node(7);
        t.BFS(t.root);
    }
}
