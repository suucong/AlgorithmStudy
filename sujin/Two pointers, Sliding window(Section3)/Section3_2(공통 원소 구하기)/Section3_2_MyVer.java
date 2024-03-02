import java.util.Arrays;
import java.util.Scanner;

public class Section3_2_MyVer {
    private String solution(int n, int[] list, int m, int[] list2) {
        Arrays.sort(list);
        Arrays.sort(list2);
        String answer = "";
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            if(list[p1] == list2[p2]) {
                answer += list[p1++] + " ";
                p2++;
            } else if(list[p1] < list2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_2_MyVer main = new Section3_2_MyVer();

        int n = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] list2 = new int[m];
        for(int j = 0; j < m; j++) {
            list2[j] = scanner.nextInt();
        }

        System.out.println(main.solution(n, list, m, list2));
    }
}
