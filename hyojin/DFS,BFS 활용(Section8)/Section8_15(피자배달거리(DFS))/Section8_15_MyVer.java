package Section8_15;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Section8_15_MyVer {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static ArrayList<Point> house = new ArrayList<>();
    static ArrayList<Point> pizza = new ArrayList<>();
    static Point[] c;

    public void solution() {
        int sum = 0;
        for (Point h :house) {
            int min = Integer.MAX_VALUE;
            for (Point p : c) {
                int dis = Math.abs(h.x - p.x) + Math.abs(h.y - p.y);
                min = Math.min(min, dis);
            }
            sum+=min;
        }
        answer = Math.min(sum, answer);
    }

    public void DFS(int L, int s) {
        if (L == m) {  // 조합이 구해졌을 때
            solution();
        } else {
            for (int i = s; i < len; i++) {
                c[L] = pizza.get(i);
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Section8_15_MyVer t = new Section8_15_MyVer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = new Point[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) house.add(new Point(i, j));
                if (tmp == 2) pizza.add(new Point(i, j));
            }
        }
        len = pizza.size();
        t.DFS(0, 0);
        System.out.println(answer);
    }
}
