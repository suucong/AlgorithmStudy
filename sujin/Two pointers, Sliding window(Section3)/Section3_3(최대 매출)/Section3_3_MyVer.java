import java.util.Scanner;

public class Section3_3_MyVer {
    private int solution(int n, int m, int[] list) {
        int answer;
        int window = 0;
        for(int i = 0; i < m; i++) {
            window += list[i];
        }
        answer = window;

        for(int j = 1; j < n-m+1; j++) {
            window += (-list[j-1] + list[j+m-1]);
            if(window > answer) {
                answer = window;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_3_MyVer main = new Section3_3_MyVer();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, list));
    }
}
