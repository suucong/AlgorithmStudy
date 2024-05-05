package Section8_06;

import java.util.Scanner;

public class Section8_06_Ver1 {

    static int n, m;
    static int[] arr;
    static int[] ch;
    static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Section8_06_Ver1 t = new Section8_06_Ver1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ch[i] = 0;
        }
        pm = new int[m];
        t.DFS(0);
    }

}
