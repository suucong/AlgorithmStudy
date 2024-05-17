package Section8_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section8_11_MyVer {

    static int[][] board = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int BFS(int x, int y) {
        int L = 0;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                if (tmp.x == 7 && tmp.y == 7) return L;
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Section8_11_MyVer t = new Section8_11_MyVer();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        System.out.println(t.BFS(1, 1));
    }
}
