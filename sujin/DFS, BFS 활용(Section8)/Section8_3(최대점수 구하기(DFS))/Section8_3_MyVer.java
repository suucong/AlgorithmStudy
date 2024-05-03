import java.util.Scanner;

public class Section8_3_MyVer {
    static int n, m, answer = Integer.MIN_VALUE;
    static int[][] q;

    static void DFS(int cur, int score, int time) {
        if (time > m) return;
        if (cur == n) {
            if (score > answer) answer = score;
        } else {
            DFS(cur + 1, score + q[cur][0], time + q[cur][1]);
            DFS(cur + 1, score, time);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        q = new int[n][2];
        for (int i = 0; i < n; i++) {
            q[i][0] = scanner.nextInt();
            q[i][1] = scanner.nextInt();
        }
        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
