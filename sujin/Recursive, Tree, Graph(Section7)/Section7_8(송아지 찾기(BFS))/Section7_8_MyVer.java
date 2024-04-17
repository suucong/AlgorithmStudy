import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section7_8_MyVer {
    public int BFS(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        int L = 0;
        int[] dist = {1, -1, 5};
        int[] check = new int[10001];
        check[s] = 1;
        queue.offer(s);

        while (!queue.isEmpty()) {
            if (check[e] == 1)  return L;
            L++;
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int cur = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int next = cur + dist[j];
                    // next가 수직선 상에 있고, 아직 지나가지 않은 경우
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        queue.offer(next);
                    }
                }
            }
        }

        return L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section7_8_MyVer T = new Section7_8_MyVer();
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
