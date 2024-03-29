import java.util.Scanner;

public class Section6_4_MyVer {

    private int[] solution(int s, int n, int[] list) {
        int[] cache = new int[s];

        for (int i = 0; i < n; i++) {
            boolean isContains = false;
            int j;
            for (j = 0; j < s; j++) {
                if (list[i] == cache[j]) {
                    isContains = true;
                    break;
                }
            }
            for (int k = (isContains ? j - 1 : s - 2); k >= 0; k--) cache[k + 1] = cache[k];
            cache[0] = list[i];
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_4_MyVer T = new Section6_4_MyVer();
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        for (int x : T.solution(s, n, list)) System.out.print(x + " ");
    }
}
