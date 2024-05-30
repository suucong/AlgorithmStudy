package Section10_2;

import java.util.Scanner;

public class Section10_2_MyVer {

    static int n;
    static int[] arr;

    public void solution(int n) {
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

    public static void main(String[] args) {
        Section10_2_MyVer t = new Section10_2_MyVer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        t.solution(n);
        System.out.println(arr[n]+arr[n-1]);
    }
}
