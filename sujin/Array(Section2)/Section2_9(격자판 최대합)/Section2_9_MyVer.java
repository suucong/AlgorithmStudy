import java.util.ArrayList;
import java.util.Scanner;

public class Section2_9_MyVer {
    private int solution(int n, int[][] list) {
        int answer = 0;
        ArrayList<Integer> sumList = new ArrayList<>();
        int p = 0;
        int k = 0;

        // 행의 합, 열의 합을 계산
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                p += list[i][j];
                k += list[j][i];
            }
            sumList.add(p);
            sumList.add(k);

            p = 0;
            k = 0;
        }

        // 대각선의 합을 계산
        for(int i = 0; i < n; i++) {
            p += list[i][i];
            k += list[i][n-1-i];
        }
        sumList.add(p);
        sumList.add(k);

        // 합의 최대값 구하기
        for(int i = 0; i < sumList.size(); i++) {
            if(answer < sumList.get(i))    answer = sumList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_9_MyVer main = new Section2_9_MyVer();
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
