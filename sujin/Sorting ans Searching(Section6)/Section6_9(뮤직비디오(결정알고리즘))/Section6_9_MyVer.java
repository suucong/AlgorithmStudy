import java.util.Arrays;
import java.util.Scanner;

public class Section6_9_MyVer {
    public static int solution(int n, int m, int[] list) {
        int min = Arrays.stream(list).max().getAsInt();
        int max = Arrays.stream(list).sum();
        int answer = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (count(list, mid) <= m){
                max = mid - 1;
                answer = mid;
            }
            else min = mid + 1;
        }

        return answer;
    }

    public static int count(int[] list, int capacity) {
        int sum = 0, count = 1;
        for (int i : list) {
            sum += i;
            if (sum > capacity) {
                sum = i;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_9_MyVer T = new Section6_9_MyVer();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        System.out.println(T.solution(n, m, list));
    }
}
