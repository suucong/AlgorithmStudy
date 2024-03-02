package Section1_10;

import java.util.Scanner;

public class Section1_10_Ver2 {
    public int[] solution(String str, char c){
        int[] answer=new int[str.length()];
        int p=1000;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }
            else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=str.length(); i>=0; i--){
            if(str.charAt(i)==c){
                p=0;
            }
            else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_10_Ver2 t = new Section1_10_Ver2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int i=0; i<t.solution(str, c).length; i++){
            System.out.println(t.solution(str, c)[i]);
        }
    }
}
