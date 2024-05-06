package Section8_07;

import java.util.Scanner;

public class Section8_07_Ver2 {

    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) {
        Section8_07_Ver2 t = new Section8_07_Ver2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(t.DFS(n, r));
    }
}
