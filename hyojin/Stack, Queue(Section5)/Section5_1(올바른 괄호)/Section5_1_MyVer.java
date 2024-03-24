package Section5_1;

import java.util.Scanner;
import java.util.Stack;

public class Section5_1_MyVer {
    public String solution(String str) {
        String answer = "YES";
        Stack st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') st.push(c);
            else if (c == ')' && !st.isEmpty()) st.pop();
            else if (c == ')' && st.isEmpty()) answer = "NO";
        }
        if (!st.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Section5_1_MyVer t = new Section5_1_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
