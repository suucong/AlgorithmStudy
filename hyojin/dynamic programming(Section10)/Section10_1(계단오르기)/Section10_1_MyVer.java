package Section10_1;

import java.util.Scanner;

public class Section10_1_MyVer {

    static int answer = 0;

    public void solution(int n) {
        if(n < 0) return;
        if (n == 0) answer++;
        else {
            solution(n - 1);
            solution(n - 2);
        }
    }

    public static void main(String[] args) {
        Section10_1_MyVer t = new Section10_1_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        t.solution(n);
        System.out.println(answer);
    }
}
