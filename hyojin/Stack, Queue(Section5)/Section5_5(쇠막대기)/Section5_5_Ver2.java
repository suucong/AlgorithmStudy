package Section5_5;

import java.util.Scanner;
import java.util.Stack;

public class Section5_5_Ver2 {
    public int solution(String str){
        int answer=0;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') st.push('(');
            else{
                st.pop();
                if(str.charAt(i-1)=='(') answer+=st.size();
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section5_5_Ver2 t = new Section5_5_Ver2();
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        System.out.println(t.solution(str));
    }
}
