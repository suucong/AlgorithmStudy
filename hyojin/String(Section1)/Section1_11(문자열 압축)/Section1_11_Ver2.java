package Section1_11;

import java.util.Scanner;

public class Section1_11_Ver2 {
    public String solution(String str){
        String answer="";
        str=str+" ";
        int cnt=1;
        for(int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else  {
                answer+=str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_11_Ver2 t = new Section1_11_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
