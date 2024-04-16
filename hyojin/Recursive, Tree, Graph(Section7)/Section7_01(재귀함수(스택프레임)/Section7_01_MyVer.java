package Section7_01;

import java.util.Scanner;

public class Section7_01_MyVer {
    public void DFS(int n){
        if(n==0) return ;
        else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        Section7_01_MyVer t = new Section7_01_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        t.DFS(n);
    }
}
