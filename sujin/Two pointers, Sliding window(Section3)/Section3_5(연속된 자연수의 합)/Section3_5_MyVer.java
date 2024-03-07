import java.util.Scanner;

public class Section3_5_MyVer {
    private int solution(int n) {
        int answer = 0;
        int window = 1, j = 1;

        for(int i = 2; i <= (n/2 + 1); i++) {
            window += i;
            while(window > n) window -= j++;
            if(window == n) answer++;
        }

        return  answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_5_MyVer main = new Section3_5_MyVer();
        int n = scanner.nextInt();

        System.out.println(main.solution(n));
    }
}
