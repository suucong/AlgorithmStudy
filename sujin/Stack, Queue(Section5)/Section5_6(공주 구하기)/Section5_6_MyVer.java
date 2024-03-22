import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Section5_6_MyVer {
    private int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int p = 0;
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(queue.size() != 1) {
            p++;
            if((p % k) != 0)    queue.offer(queue.poll());
            else queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_6_MyVer T = new Section5_6_MyVer();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(T.solution(n, k));
    }
}
