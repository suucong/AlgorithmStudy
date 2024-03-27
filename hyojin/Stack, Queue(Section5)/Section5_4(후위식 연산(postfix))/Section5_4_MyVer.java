package Section5_4;

import java.util.Scanner;
import java.util.Stack;

public class Section5_4_MyVer {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                int n1 = st.pop();
                int n2 = st.pop();
                switch (c) {
                    case '+':
                        answer = n1 + n2;
                        st.push(answer);
                        break;
                    case '-':
                        answer = n2 - n1;
                        st.push(answer);
                        break;
                    case '*':
                        answer = n1 * n2;
                        st.push(answer);
                        break;
                    case '/':
                        answer = n1 / n2;
                        st.push(answer);
                        break;
                }
            } else st.push(Character.getNumericValue(c));
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_4_MyVer t = new Section5_4_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
