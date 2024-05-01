package Section8_02;

import java.util.Map;
import java.util.Scanner;

public class Section8_02_MyVer {

    static int[] arr;
    static int n, c;
    static int max = Integer.MIN_VALUE;

    public static void DFS(int L, int sum) {
        if (L == n) {
            if (sum > max && sum < c) {
                max = sum;
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(0,0);
        System.out.println(max);
    }
}
