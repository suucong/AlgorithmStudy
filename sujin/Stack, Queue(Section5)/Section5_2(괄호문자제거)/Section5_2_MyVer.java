import java.util.Scanner;
import java.util.Stack;

public class Section5_2_MyVer {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(char c : str.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                stack.pop();
            } else {
                if(stack.isEmpty()) {
                    answer += c;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Section5_2_MyVer T = new Section5_2_MyVer();
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
