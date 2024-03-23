import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Section5_7_MyVer {
    private String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < str1.length(); i++)  queue.offer(str1.charAt(i));
        for(char c : str2.toCharArray()) {
            if(queue.isEmpty()) break;
            else if(c == queue.peek())   queue.poll();
        }
        if(!queue.isEmpty())    answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_7_MyVer T = new Section5_7_MyVer();
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(T.solution(str1, str2));
    }
}
