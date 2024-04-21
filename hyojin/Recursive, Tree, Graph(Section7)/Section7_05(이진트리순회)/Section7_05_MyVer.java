package Section7_05;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Section7_05_MyVer {
    //전위순회
    public static void DFS_1(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        DFS_1(root.lt);
        DFS_1(root.rt);
    }

    //중위순회
    public static void DFS_2(Node root) {
        if(root == null) return;
        DFS_1(root.lt);
        System.out.print(root.data + " ");
        DFS_1(root.rt);
    }

    //후위순회
    public static void DFS_3(Node root) {
        if(root == null) return;
        DFS_1(root.lt);
        DFS_1(root.rt);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root;
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        System.out.print("전위순회: ");
        DFS_1(root);
        System.out.println();
        System.out.print("중위순회: ");
        DFS_2(root);
        System.out.println();
        System.out.print("후위순회: ");
        DFS_3(root);
    }
}
