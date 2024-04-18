class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.lt = this.rt = null;
    }
}

public class Section7_9_MyVer {
    Node root;
    static int level = 0;
    static int smallest = Integer.MAX_VALUE;

    public void DFS(Node root) {
        if (root != null) {
            if (root.lt == null && root.rt == null) {
                if (level < smallest) smallest = level;
                return;
            }
            level++;
            DFS(root.lt);
            DFS(root.rt);
            level--;    // 다시 상위 노드로 올라가야 하기 때문에 감소
        }
    }

    public static void main(String[] args) {
        Section7_9_MyVer T = new Section7_9_MyVer();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.root.lt.lt.lt = new Node(8);
        T.DFS(T.root);
        System.out.println(smallest);
    }
}
