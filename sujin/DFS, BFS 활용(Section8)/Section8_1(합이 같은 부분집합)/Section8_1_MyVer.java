import java.util.Scanner;

public class Section8_1_MyVer {
    public static String answer = "NO";
    public static int[] list;
    public static int total = 0;

    public void DFS(int index, int sum) {
        if (sum > (total / 2)) return;
        else if (sum == (total - sum)) answer = "YES";
        else {
            if ((index + 1) < list.length && answer.equals("NO")) {
                DFS(index + 1, sum + list[index]);
                DFS(index + 1, sum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section8_1_MyVer T = new Section8_1_MyVer();
        int n = scanner.nextInt();
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
            total += list[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
