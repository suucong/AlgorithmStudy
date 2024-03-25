package Section5_2;

import javax.naming.CannotProceedException;
import java.util.Scanner;
import java.util.Stack;

public class Section5_2_MyVer {
    public String solution(String str) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (st.lastElement() != '(') {
                    st.pop();
                }
                st.pop();
            } else st.push(x);

        }
        for (int i = 0; i < st.size(); i++) answer += st.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Section5_2_MyVer t = new Section5_2_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
