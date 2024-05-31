package Section10_3;

import java.util.Arrays;
import java.util.Scanner;

public class Section10_3_MyVer {

    static int[] dy;
    static int[] arr;

    public int solution(int n, int[] arr) {
        int answer = Integer.MIN_VALUE;
        dy[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            int max = 0;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] < arr[j]) {
                    max = Math.max(max,dy[j]);
                }
                dy[i] = max+1;
            }
            answer = Math.max(dy[i], answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Section10_3_MyVer t = new Section10_3_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        Arrays.fill(dy,Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
