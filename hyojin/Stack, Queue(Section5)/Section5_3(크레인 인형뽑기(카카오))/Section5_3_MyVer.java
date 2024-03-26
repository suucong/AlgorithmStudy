package Section5_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Section5_3_MyVer {
    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        ArrayList<Stack<Integer>> stackList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n - 1; j >= 0; j--) {
                if (board[j][i] != 0) stack.push(board[j][i]);
            }
            stackList.add(stack);
        }
        Stack<Integer> basket = new Stack<>();
        for (int x : moves) {
            int c = 0;
            if (!stackList.get(x - 1).isEmpty()) c = stackList.get(x - 1).pop();  // 인형 꺼내기
            if (!basket.isEmpty() && basket.peek() == c) {
                while (c == basket.peek()) {  // 바구니에 같은 인형 없을때까지 꺼내기
                    answer++;  // 인형 꺼낼때마다 추가
                    basket.pop();
                }
                answer++;  // 새로 넣고 바로 터지는 인형
            } else basket.push(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_3_MyVer t = new Section5_3_MyVer();
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
        System.out.println(t.solution(n, board, m, moves));
    }
}
