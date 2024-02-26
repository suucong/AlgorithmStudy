import java.util.Scanner;

public class Section2_4_MyVer {
    private String solution(int n) {
        String answer = "1";
        int[] list = new int[n+1];
        list[0] = 0;
        list[1] = 1;

        for(int i = 2; i <= n; i++) {
            list[i] = list[i-2] + list[i-1];
            answer += " " + list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_4_MyVer main = new Section2_4_MyVer();
        int n = scanner.nextInt();

        System.out.println(main.solution(n));
    }
}
