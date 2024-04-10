import java.util.Scanner;

public class Section7_3_MyVer {
    public static int DFS(int n) {
        if (n == 1)     return 1;
        else    return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(DFS(n));
    }
}
