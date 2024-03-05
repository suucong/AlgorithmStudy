package Section1_12;

import java.util.Scanner;

public class Section1_12_Ver2 {
    public String solution(int n, String str){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=str.substring(0,7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
            str=str.substring(7);
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_12_Ver2 t = new Section1_12_Ver2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(t.solution(n,str));
    }
}
