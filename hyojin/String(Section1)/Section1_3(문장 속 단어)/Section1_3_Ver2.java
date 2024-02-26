package Section1_3;

import java.util.Scanner;

public class Section1_3_Ver2 {
    public String solution(String str){
        String answer=" ";
        int m= Integer.MIN_VALUE;
        String[] s=str.split(" ");

        for(String x: s){
            int len=x.length();
            if(len>m){
                m=len;
                answer=x;
            }

        }
        return answer;
    }
    public static void main(String[] args){
        Section1_3_Ver2 t= new Section1_3_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(t.solution(str));
    }
}

