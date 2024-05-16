package Section8_10;

import java.util.Scanner;

public class Section8_10_MyVer {

    static int[][] maze = new int[9][9];
    static int answer = 0;

    public void DFS(int L1, int L2) {
        if (L1 == 7 && L2 == 7) {
            answer++;
        } else {
            if (maze[L1 + 1][L2] == 0) {
                maze[L1 + 1][L2] = 1;
                DFS(L1 + 1, L2);
                maze[L1 + 1][L2] = 0;
            }
            if (maze[L1 - 1][L2] == 0) {
                maze[L1 - 1][L2] = 1;
                DFS(L1 - 1, L2);
                maze[L1 - 1][L2] = 0;
            }
            if (maze[L1][L2 + 1] == 0) {
                maze[L1][L2 + 1] = 1;
                DFS(L1, L2 + 1);
                maze[L1][L2 + 1] = 0;
            }
            if (maze[L1][L2 - 1] == 0) {
                maze[L1][L2 - 1] = 1;
                DFS(L1, L2 - 1);
                maze[L1][L2 - 1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Section8_10_MyVer t = new Section8_10_MyVer();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) maze[i][j] = 1;
                else maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1] = 1;
        t.DFS(1, 1);
        System.out.println(answer);
    }
}
