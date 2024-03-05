import java.util.Scanner;

public class Section3_4_MyVer {
    private int solution(int n, int m, int[] list) {
        int answer = 0;
        int window = list[0];
        int j = 0;

        for(int i = 1; i < n; i++) {
            window += list[i];
            while(window > m && j >= 0) {
                window -= list[j++];
            }
            if(window == m) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_4_MyVer main = new Section3_4_MyVer();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, list));
    }
}
