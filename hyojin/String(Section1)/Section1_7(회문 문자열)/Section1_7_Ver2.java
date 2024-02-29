package Section1_7;

import java.util.Scanner;

public class Section1_7_Ver2 {
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();

        //절반만 돌기
        for(int i=0; i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args){
        Section1_7_Ver2 t = new Section1_7_Ver2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
