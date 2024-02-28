import java.util.Scanner;

public class Section2_5_MyVer {
    private int solution(int n) {
        int answer = 0;
        int list[] = new int[n+1];
        list[0] = list[1] = 1;

        for(int i = 2; i <= n; i++) {
            if(list[i] == 0) {
                answer++;
                for(int j = 2; i*j <= n; j++)   list[i*j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_5_MyVer main = new Section2_5_MyVer();
        int n = scanner.nextInt();

        System.out.println(main.solution(n));
    }
}
