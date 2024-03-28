import java.util.Scanner;

public class Section6_3_MyVer {

    private int[] solution(int n, int[] list) {
        int i, j;
        for (i = 1; i < n; i++) {
            int key = list[i];
            for (j = i - 1; j >= 0; j--) {
                if (key < list[j])  list[j + 1] = list[j];
                else    break;
            }
            list[j + 1] = key;
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section6_3_MyVer T = new Section6_3_MyVer();
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();
        for (int i : T.solution(n, list)) System.out.print(i + " ");
    }
}
