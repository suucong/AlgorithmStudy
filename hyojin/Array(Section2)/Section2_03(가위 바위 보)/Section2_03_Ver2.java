package Section2_03;

import java.util.Scanner;

public class Section2_03_Ver2 {
    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a==b) answer+='D';
            else if(a[i]==1 && b[i]==3) answer+='A';
            else if(a[i]==2 && b[i]==1) answer+='A';
            else if(a[i]==3 && b[i]==2) answer+='A';
            else answer+='B';
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_03_Ver2 t = new Section2_03_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[5];
        int[] b=new int[5];
        for(int i=0 ; i<n; i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0 ; i<n; i++){
            b[i]=scanner.nextInt();
        }
        for(char x: t.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
