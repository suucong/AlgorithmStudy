import java.util.Scanner;

public class Section7_2_MyVer {
    public static void DFS(int n) {
        if ((n / 2) == 0)   System.out.print(n % 2);
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DFS(n);
    }
}
