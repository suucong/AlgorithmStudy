package Section6_08;

import java.util.Arrays;
import java.util.Scanner;

public class Section6_08_MyVer {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) answer = i + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section6_08_MyVer t = new Section6_08_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, m, arr));
    }
}
