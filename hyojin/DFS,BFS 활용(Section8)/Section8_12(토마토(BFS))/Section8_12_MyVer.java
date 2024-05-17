package Section8_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Section8_12_MyVer {

    static int n, m, L;
    static int[][] tomato;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Queue<Point> q = new LinkedList<>();

    public void BFS() {
        L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && tomato[nx][ny] == 0) {
                        tomato[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
            if(!q.isEmpty()) L++;
        }
    }

    public static void main(String[] args) {
        Section8_12_MyVer t = new Section8_12_MyVer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        tomato = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tomato[i][j] = sc.nextInt();
                if (tomato[i][j] == 1) q.offer(new Point(i, j));
            }
        }

        t.BFS();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (tomato[i][j] == 0) L = -1;
            }
        }
        System.out.println(L);

    }
}
