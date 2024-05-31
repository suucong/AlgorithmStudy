package Section10_5;

import java.util.Scanner;

public class Section10_5_MyVer {

    public int solution(int n, int[] arr, int m) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            answer += m/arr[i];
            m= m % arr[i];
            if(m == 0) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section10_5_MyVer t = new Section10_5_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(t.solution(n, arr, m));
    }


}
