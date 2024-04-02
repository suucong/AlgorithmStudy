import java.util.Arrays;
import java.util.Scanner;

public class Section6_8_MyVer {
    int solution(int n, int m, int[] list) {
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        Arrays.sort(list);
        while (low <= high) {
            mid = (low + high) / 2;
            if (list[mid] > m)  high = mid - 1;
            else if (list[mid] == m)    break;
            else    low = mid + 1;
        }

        return mid + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_8_MyVer T = new Section6_8_MyVer();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        System.out.println(T.solution(n, m, list));
    }
}
