package Section8_09;

import java.util.Scanner;

public class Section8_09_MyVer {

    static int n, m;
    static int[] c;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : c) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                c[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Section8_09_MyVer t = new Section8_09_MyVer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = new int[m];
        t.DFS(0, 1);
    }
}
