import java.util.Scanner;

public class Section3_6_MyVer {
    private int solution(int n, int k, int[] list) {
        int answer = 0, h = 0, window = 0, lt = 0;

        for(int i = 0; i < n; i++) {
            if(list[i] == 1) {
                window++;
            } else if(list[i] == 0) {
                h++;
                window++;
                while (h > k && lt < n - 1) {
                    if (list[lt] == 0) h--;
                    lt++;
                    window--;
                }
            }
            
            answer = Math.max(window, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section3_6_MyVer main = new Section3_6_MyVer();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, k, list));
    }
}
