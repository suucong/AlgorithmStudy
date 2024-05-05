import java.util.Scanner;

public class Section8_4_Ver1 {
    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section8_4_Ver1 T = new Section8_4_Ver1();
        n = scanner.nextInt();
        m = scanner.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
