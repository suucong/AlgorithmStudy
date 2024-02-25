import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Section1_2_Ver3 {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else  answer+=(char)(x+32);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_2_Ver3 t = new Section1_2_Ver3();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(t.solution(str));
    }
}
