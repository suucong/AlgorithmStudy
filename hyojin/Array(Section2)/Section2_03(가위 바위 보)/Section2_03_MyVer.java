package Section2_03;

import java.util.Scanner;

public class Section2_03_MyVer {
    public char solution(int a, int b){
        char answer;
        if(a==b) answer='D';
        else if(a==1 && b==3) answer='A';
        else if(a==2 && b==1) answer='A';
        else if(a==3 && b==2) answer='A';
        else answer='B';
        return answer;
    }
    public static void main(String[] args){
        Section2_03_MyVer t = new Section2_03_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[5];
        int[] B=new int[5];
        for(int i=0 ; i<n; i++){
            A[i]=scanner.nextInt();
        }
        for(int i=0 ; i<n; i++){
            B[i]=scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(t.solution(A[i],B[i]));
        }
    }
}
