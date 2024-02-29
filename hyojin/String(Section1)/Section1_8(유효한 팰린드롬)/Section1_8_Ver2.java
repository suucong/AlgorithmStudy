package Section1_8;

import java.util.Scanner;

public class Section1_8_Ver2 {
    public String solution(String str){
        String answer="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]",""); //A-Z가 아닌 문자는 ""으로 대체.
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";

        return answer;
    }
    public static void main(String[] args){
        Section1_8_Ver2 t = new Section1_8_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(t.solution(str));
    }
}
