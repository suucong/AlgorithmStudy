import java.util.Scanner;

public class Section2_10_MyVer {
    private int solution(int n, int[][] list) {
        int answer = 0;
        int[][] list2 = new int[n+2][n+2];

        // 2차원 배열 크기 확장(가장자리 추가)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                list2[i+1][j+1] = list[i][j];
            }
        }

        // 상하좌우 비교하여 가장 클 경우에만 answer++
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int cmt = list2[i][j];
                if(list2[i-1][j] < cmt && list2[i+1][j] < cmt
                    && list2[i][j-1] < cmt && list2[i][j+1] < cmt)  answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_10_MyVer main = new Section2_10_MyVer();
        int n = scanner.nextInt();
        int[][] list = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                list[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, list));
    }
}
