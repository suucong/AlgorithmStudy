import java.util.Scanner;

public class Section7_4_Ver2 {
    static int[] memo;

    public static int DFS(int n) {
        if (memo[n] != 0)   return memo[n];
        if (n <= 2) return memo[n] = 1;
        else return memo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memo = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(memo[i] + " ");
    }
}
