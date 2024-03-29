package Section5_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section5_6_MyVer {
    public int solution(int n, int k) {
        int answer;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        int cnt = k;
        while (queue.size() != 1) {
            cnt++;
            if (cnt % k != 0) queue.add(queue.poll());
            else queue.poll();
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        Section5_6_MyVer t = new Section5_6_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(t.solution(n, k));
    }
}
