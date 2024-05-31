package Section10_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Problem {
    int p, t;

    public Problem(int p, int t) {
        this.p = p;
        this.t = t;
    }
}

public class Section10_6_MyVer {

    static int n, m;
    static int[] dy;

    public int solution(ArrayList<Problem> arr) {
        Arrays.fill(dy, 0);
        for (int i = 0; i < arr.get(0).t; i++) {
            dy[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int t = arr.get(i).t;
            for (int j = m; j >= t; j--) {
                dy[j] = Math.max(dy[j], dy[j - t] + arr.get(i).p);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Section10_6_MyVer t = new Section10_6_MyVer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<Problem> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Problem(a, b));
        }
        dy = new int[m + 1];
        System.out.println(t.solution(arr));
    }
}
