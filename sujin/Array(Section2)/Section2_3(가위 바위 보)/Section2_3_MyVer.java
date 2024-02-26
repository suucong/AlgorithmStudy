import java.util.Scanner;

public class Section2_3_MyVer {
    private char[] solution(int n, int[] A, int[] B) {
        char[] answer = new char[n];

        for(int i = 0; i < n; i++) {
            if(A[i] == B[i]) {  // 비겼을 때
                answer[i] = 'D';
            } else if((A[i]+B[i]) == 3) {  // 가위 & 바위
                answer[i] = (A[i] == 2) ? 'A' : 'B';
            } else if((A[i]+B[i]) == 4) {   // 가위 & 보
                answer[i] = (A[i] == 1) ? 'A' : 'B';
            } else if((A[i]+B[i]) == 5) {   // 바위 & 보
                answer[i] = (A[i] == 3) ? 'A' : 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_3_MyVer main = new Section2_3_MyVer();
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        char[] answer = main.solution(n, A, B);

        for(int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}
