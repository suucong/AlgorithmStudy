import java.util.Scanner;

public class Section8_2_MyVer {
    static int n, c;
    static int biggest = Integer.MIN_VALUE;
    static int[] dogs;

    public void DFS(int curDog, int sum) {
        if (sum > c) return;
        else if (sum > biggest) biggest = sum;
        if (curDog == n) return;
        DFS(curDog + 1, sum + dogs[curDog]);
        DFS(curDog + 1, sum);
    }

    public static void main(String[] args) {
        Section8_2_MyVer T = new Section8_2_MyVer();
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        dogs = new int[n];
        for (int i = 0; i < n; i++) dogs[i] = scanner.nextInt();
        T.DFS(0, 0);
        System.out.println(biggest);
    }
}