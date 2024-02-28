package Section1_6;

import java.util.Scanner;

public class Section1_6_Ver2 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length();i++){

            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_6_Ver2 t= new Section1_6_Ver2();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(t.solution(input1));
    }
}
