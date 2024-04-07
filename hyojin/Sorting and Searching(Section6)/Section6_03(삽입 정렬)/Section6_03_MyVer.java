package Section6_03;

import java.util.Scanner;

public class Section6_03_MyVer {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Section6_03_MyVer t = new Section6_03_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : t.solution(n, arr)) System.out.print(x + " ");
    }
}
