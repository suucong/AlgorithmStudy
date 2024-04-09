import java.util.Arrays;
import java.util.Scanner;

public class Section6_10_MyVer {
    public static int solution(int n, int c, int[] list) {
        Arrays.sort(list);
        int min = 1;
        int max = list[n - 1];
        int mid = 0, answer = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (count(n, mid, list) >= c) {
                answer = mid;
                min = mid + 1;
            } else    max = mid - 1;
        }

        return answer;
    }

    public static int count(int n, int distance, int[] list) {
        int count = 1, end = 0;
        for (int i = 1; i < n; i++) {
            if ((list[i] - list[end]) >= distance) {
                end = i;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        System.out.println(solution(n, c, list));
    }
}
