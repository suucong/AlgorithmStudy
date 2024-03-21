import java.util.Scanner;
import java.util.Stack;

public class Section5_5_MyVer {
    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        char[] cList = str.toCharArray();
        stack.push(-1);
        for(int i = 1; i < cList.length; i++) {
            if(cList[i] == '(') stack.push(0);
            else {
                if(cList[i-1] == '(' && !stack.isEmpty()) {
                    stack.pop();
                    stack.push(1);
                } else {
                    int p = 0;
                    while(stack.peek() != 0) {
                        p += stack.pop();
                    }
                    stack.pop();
                    stack.push(p);
                    answer += (p + 1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_5_MyVer T = new Section5_5_MyVer();
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
