package Section10_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Section10_3_Ver2 {

    static int[] arr;
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(dy[i], answer);
        }

        return answer;
    }


    public static void main(String[] args) {
        Section10_3_Ver2 t = new Section10_3_Ver2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        Arrays.fill(dy, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(arr));
    }
}
