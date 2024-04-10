import java.util.Scanner;

public class Section7_1_MyVer {
    public static void DFS(int n) {
        if (n == 1) System.out.print(1 + " ");
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DFS(n);
    }
}
