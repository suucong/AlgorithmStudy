import java.util.Arrays;
import java.util.Scanner;

public class Section6_5_MyVer {

    private char solution(int n, int[] list) {
        char answer = 'U';

        Arrays.sort(list);
        for (int k = 0; k < n - 1; k++) if (list[k] == list[k + 1]) return 'D';

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_5_MyVer T = new Section6_5_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        System.out.println(T.solution(n, list));
    }
}
