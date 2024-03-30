package Section5_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section5_7_MyVer {

    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : str1.toCharArray()) {
            q.offer(x);
        }
        for (char x : str2.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return  "NO";
            }
        }
        if(!q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Section5_7_MyVer t = new Section5_7_MyVer();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(t.solution(str1, str2));
    }
}
