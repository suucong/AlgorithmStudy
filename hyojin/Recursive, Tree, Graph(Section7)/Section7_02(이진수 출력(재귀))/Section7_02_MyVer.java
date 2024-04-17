package Section7_02;

import java.util.Scanner;

public class Section7_02_MyVer {

    public static void DFS(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        DFS(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }
}
