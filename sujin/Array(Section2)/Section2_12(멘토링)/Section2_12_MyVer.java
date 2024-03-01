import java.util.Scanner;

public class Section2_12_MyVer {
    private int solution(int n, int m, int[][] list) {
        int answer =  0;

        for(int i = 1; i <= n; i++) {   // n명의 학생을 각각
            for(int j = 1; j <= n; j++) {   // n명의 학생과 비교
                boolean cnt = true;
                for(int k = 0; k < m; k++) {    // 시험별 반복
                    int a = 0;  // i번 학생의 등수를 저장
                    int b = 0;  // j번 학생의 등수를 저장
                    for(int l = 0; l < n; l++) {    // 학생별 반복
                        if(list[k][l] == i) {   // 학생의 번호와 i가 같으면 a에 l(등수) 저장
                            a = l;
                        }
                        if(list[k][l] == j) {   // 학생의 번호와 j가 같으면 b에 l(등수) 저장
                            b = l;
                        }
                    }

                    // 등수가 높거나 같으면 false로 변경 후 break. 한 시험이라도 등수가 높지 않으면 안되기 때문.
                    // 같을 때도 false한 이유: 자기 자신도 비교하기 때문
                    if(a <= b) {
                        cnt = false;
                        break;
                    }
                }

                if(cnt) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_12_MyVer main = new Section2_12_MyVer();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] list = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                list[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, m, list));
    }
}
