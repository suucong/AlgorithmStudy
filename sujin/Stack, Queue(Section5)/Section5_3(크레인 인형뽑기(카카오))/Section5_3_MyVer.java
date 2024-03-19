import java.util.Stack;
import java.util.Scanner;

public class Section5_3_MyVer {
    private int solution(int n, int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int col : moves) {
            int doll = 0;

            for (int row = 0; row < n; row++) {
                if (board[row][col] != 0) {
                    doll = board[row][col];
                    board[row][col] = 0; // 인형을 집었으니 해당 칸은 0으로 처리
                    break;
                }
            }

            // 인형을 바구니에 넣는 과정
            if (doll != 0) {
                // 바구니가 비어있지 않고, 바구니 맨 위의 인형이 현재 집은 인형과 같은 경우
                if (!basket.isEmpty() && basket.peek() == doll) {
                    basket.pop(); // 바구니 맨 위의 인형 제거
                    answer += 2; // 사라진 인형 카운트 증가
                } else {
                    basket.push(doll); // 인형 바구니에 넣기
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_3_MyVer T = new Section5_3_MyVer();
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt() - 1;
        }

        System.out.println(T.solution(n, board, moves));
    }
}
