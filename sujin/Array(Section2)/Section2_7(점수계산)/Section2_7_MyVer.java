import java.util.Scanner;

public class Section2_7_MyVer {
    public int solution(int n, int[] list) {
        int answer = (list[0] == 1) ? 1 : 0;
        int p = 1;

        for(int i = 1; i < n; i++) {
            if(list[i] == 1 && list[i-1] == 1) {
                answer += ++p;
            } else if(list[i] == 1 && list[i-1] != 1) {
                p = 1;
                answer += p;
            } else {
                p = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_7_MyVer main = new Section2_7_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, list));
    }
}
