package Section1_9;

import java.util.Scanner;

public class Section1_9_Ver2 {
    public int solution(String str){
        int answer=0;
        for(char c:str.toCharArray()){
            if(c>=48&&c<=57) answer=answer*10+(c-48);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_9_Ver2 t = new Section1_9_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(t.solution(str));
    }
}
