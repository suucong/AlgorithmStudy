import java.util.Scanner;

public class Section6_2_MyVer {
    private int[] solution(int n, int[] list) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(list[j] > list[j+1]) {
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j + 1] = tmp;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_2_MyVer T = new Section6_2_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++)  list[i] = scanner.nextInt();
        for(int i : T.solution(n, list))    System.out.print(i + " ");
    }
}
