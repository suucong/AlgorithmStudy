package Section5_4;

import java.util.Scanner;
import java.util.Stack;

public class Section5_4_Ver2 {
    public int solution(String str) {
        int answer;
        Stack<Integer> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) st.push(x - 48);
            else {
                int rt = st.pop();
                int lt = st.pop();
                if (x == '+') st.push(lt + rt);
                else if (x == '-') st.push(lt - rt);
                else if (x == '*') st.push(lt * rt);
                else if (x == '/') st.push(lt / rt);
            }
        }
        answer = st.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Section5_4_Ver2 t = new Section5_4_Ver2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(t.solution(str));
    }
}
