package Section5_1;

import java.util.Scanner;
import java.util.Stack;

public class Section5_1_Ver2 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Section5_1_Ver2 t = new Section5_1_Ver2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
