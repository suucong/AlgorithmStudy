package Section8_03;

import java.util.Scanner;

public class Section8_03_MyVer {

    static int[] points;
    static int[] time;

    static int n, m;
    static int answer=Integer.MIN_VALUE;

    public static void DFS(int L, int pointSum, int timeSum) {
        if(timeSum>m) return;
        if (L == n) {
            answer = Math.max(pointSum, answer);
        }
        else{
            DFS(L + 1, pointSum + points[L], timeSum + time[L]);
            DFS(L + 1, pointSum, timeSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        points = new int[n];
        time = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        DFS(0,0,0);
        System.out.println(answer);
    }
}
