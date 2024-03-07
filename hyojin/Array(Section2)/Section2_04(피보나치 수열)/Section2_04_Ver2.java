package Section2_04;

import java.util.Scanner;

public class Section2_04_Ver2 {
    public void solution(int n){
        int a=1, b=1, c;
        System.out.println(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Section2_04_MyVer t = new Section2_04_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        t.solution(n);
    }
}
