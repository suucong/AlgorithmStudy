package Section5_5;

import java.util.Scanner;
import java.util.Stack;

public class Section5_5_MyVer {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        boolean flag = false; // 직전에 있던 문자가 '('인지 아닌지 확인
        for (char x : str.toCharArray()) {
            if (x == ')' && flag) {
                st.push(st.pop() + 1);
                flag = false;
            } else if (x == ')' && !flag) {
                int cnt = 0;  // '()'의 개수
                while (st.peek() != 0) cnt += st.pop();
                st.push(st.pop() + cnt);
                answer += cnt + 1;
            } else {
                flag = true;
                st.push(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_5_MyVer t = new Section5_5_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
