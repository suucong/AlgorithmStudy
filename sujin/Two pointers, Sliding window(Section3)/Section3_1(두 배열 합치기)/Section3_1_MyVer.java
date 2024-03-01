import java.util.Scanner;

public class Section3_1_MyVer {
    private String solution(int n, int[] list, int m, int[] list2) {
        String answer = "";
        int[] sum = new int[n+m];

        // 두 배열 합치기
        for(int j = 0; j < n; j++) {
            sum[j] = list[j];
        }
        for(int j = 0; j < m; j++) {
            sum[j+n] = list2[j];
        }

        // 선택 정렬을 이용하여 오름차순 정렬
        for(int k = 0; k < n+m-1; k++) {
            int min_index = k;

            for(int t = k+1; t < n+m; t++) {
                if(sum[t] < sum[min_index]) {
                    min_index = t;
                }
            }

            int tmp = sum[k];
            sum[k] = sum[min_index];
            sum[min_index] = tmp;
        }

        for(int k = 0; k < n+m; k++) {
            answer += sum[k] + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_1_MyVer main = new Section3_1_MyVer();
        int n = scanner.nextInt();
        int list[] = new int[n];

        for(int j = 0; j < n; j++) {
            list[j] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int list2[] = new int[m];

        for(int k = 0; k < m; k++) {
            list2[k] = scanner.nextInt();
        }

        System.out.println(main.solution(n, list, m, list2));
    }
}
