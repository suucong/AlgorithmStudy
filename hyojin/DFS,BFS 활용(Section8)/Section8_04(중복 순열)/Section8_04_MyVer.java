package Section8_04;

import java.util.Scanner;

public class Section8_04_MyVer {

    static int[] pm;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i]+" ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        DFS(0);
    }
}
