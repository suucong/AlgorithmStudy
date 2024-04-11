import java.util.Scanner;

public class Section7_4_Ver1 {
    public static int DFS(int n) {
        if (n == 1 || n == 2)    return 1;
        else  return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(DFS(i) + " ");
    }
}
