import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Section1_2_Ver2 {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if(isUpperCase(x)) answer+=Character.toLowerCase(x);
            else  answer+=Character.toUpperCase(x);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_2_Ver2 t = new Section1_2_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(t.solution(str));
    }
}
