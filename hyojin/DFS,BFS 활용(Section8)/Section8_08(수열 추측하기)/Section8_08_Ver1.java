package Section8_08;

import java.util.Scanner;

public class Section8_08_Ver1 {

    static int n, f;
    static int[] b, p, ch;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return dy[n][r];
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if(flag) return;
        if (L == n) {
            if(sum == f) {
                for(int x: p) System.out.print(x+ " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Section8_08_Ver1 t = new Section8_08_Ver1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = t.combi(n - 1, i);
        }
        t.DFS(0, 0);
    }
}
