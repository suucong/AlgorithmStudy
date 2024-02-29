package Section1_7;

import java.util.Scanner;

public class Section1_7_MyVer {
    public String solution(String str){
        String answer="YES";
        String strUp=str.toUpperCase();
        String tmp=new StringBuilder(strUp).reverse().toString();
        if(!strUp.equals(tmp)) return "NO";
        return answer;
    }
    public static void main(String[] args){
        Section1_7_MyVer t = new Section1_7_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
