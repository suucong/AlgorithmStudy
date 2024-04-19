package Section7_04;

import java.util.Scanner;

public class Section7_04_Ver2 {

    static int[] arr;

    public static int DFS(int n) {
        if (n == 1) return arr[n] = 1;
        else if (n == 2) return arr[n] = 1;
        else {
            return arr[n] = DFS(n - 1) + DFS(n - 2);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
    }

}
