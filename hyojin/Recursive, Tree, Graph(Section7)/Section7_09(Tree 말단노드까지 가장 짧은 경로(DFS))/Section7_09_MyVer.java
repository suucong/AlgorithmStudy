package Section7_09;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.rt = this.lt = null;
    }
}

public class Section7_09_MyVer {

    static int L = 0;
    static int small = Integer.MAX_VALUE;

    public static void DFS(Node root) {
        if(root.lt == null && root.rt == null){
            small = Math.min(L, small);
            return;
        }
        else {
            L ++;
            DFS(root.lt);
            DFS(root.rt);
            L--;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        DFS(root);
        System.out.println(small);
    }
}
