package Section7_04;

import java.util.Scanner;

public class Section7_04_MyVer {
    public static int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            return DFS(n - 1) + DFS(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(DFS(i)+" ");
        }
    }
}
