package Section8_05;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Section8_05_MyVer {

    static int[] arr;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int money) {
        if (L >= answer) return;
        if (money < 0) return;
        if (money == 0) {
            answer = Math.min(answer, L);
            return;
        } else {
            L++;
            for (int i = arr.length - 1; i >= 0; i--) {
                DFS(L, money - arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Section8_05_MyVer t = new Section8_05_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        Arrays.sort(arr);

        t.DFS(0, money);
        System.out.println(answer);
    }
}
