import java.util.Scanner;
import java.util.Arrays;

public class Section6_7_MyVer {
    private int[][] solution(int[][] list) {
        Arrays.sort(list, (a, b) -> {
            if (a[0] == b[0])   return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_7_MyVer T = new Section6_7_MyVer();
        int n = scanner.nextInt();
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            list[i][0] = scanner.nextInt();
            list[i][1] = scanner.nextInt();
        }
        for(int[] point : T.solution(list))
            System.out.println(point[0] + " " + point[1]);
    }
}
