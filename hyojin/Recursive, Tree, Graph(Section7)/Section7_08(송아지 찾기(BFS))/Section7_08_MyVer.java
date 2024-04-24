package Section7_08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.lt = this.rt = null;
    }
}

public class Section7_08_MyVer {
    public int BFS(Node root, int e) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.data == e) return L;
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }
            L++;
        }
        return L;
    }

    public void DFS(Node root, int e) {
        if (root.data == e) {
            return;
        } else if (root.data > e) {
            root.lt = new Node(root.data - 1);
            DFS(root.lt, e);
        } else {
            root.lt = new Node(root.data + 1);
            DFS(root.lt, e);
            root.rt = new Node(root.data + 5);
            DFS(root.rt, e);
        }
    }

    public static void main(String[] args) {
        Section7_08_MyVer t = new Section7_08_MyVer();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();

        Node root = new Node(s);
        t.DFS(root, e);
        System.out.println(t.BFS(root, e));
    }
}
