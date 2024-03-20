import java.util.Scanner;
import java.util.Stack;

public class Section5_4_MyVer {
    private int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c >= '0' && c <= '9') {
                stack.push(c - '0');
            } else if(c == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if (c == '-') {
                stack.push(-stack.pop() + stack.pop());
            } else if (c == '/') {
                int last = stack.pop();
                int first = stack.pop();
                stack.push(first / last);
            } else if (c == '*') {
                stack.push(stack.pop() * stack.pop());
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Section5_4_MyVer T = new Section5_4_MyVer();
       String str = scanner.next();

       System.out.println(T.solution(str));
    }
}
