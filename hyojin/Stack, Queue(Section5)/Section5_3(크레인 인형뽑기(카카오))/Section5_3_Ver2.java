package Section5_3;

import java.util.Scanner;
import java.util.Stack;

public class Section5_3_Ver2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (st.isEmpty() && st.peek() == tmp) {
                        answer += 2;
                        st.pop();
                    } else st.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_3_Ver2 t = new Section5_3_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = scanner.nextInt();
        System.out.println(t.solution(board, moves));
    }
}
