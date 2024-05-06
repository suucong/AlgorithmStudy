package Section8_07;

import java.util.Scanner;

public class Section8_07_MyVer {

    public int DFS(int n, int m) {
        if(m == 1) return n;
        if(n == m) return 1;
        return DFS(n-1,m-1) + DFS(n-1, m);
    }

    public static void main(String[] args) {
        Section8_07_MyVer t = new Section8_07_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(t.DFS(n, m));
    }
}
