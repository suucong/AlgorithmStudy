import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section7_14_MyVer {
    static int[] answer, check;
    static ArrayList<ArrayList<Integer>> graph;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        queue.offer(v);
        check[v] = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur > 1 && answer[cur] == 0) answer[cur] = num;
                for (int j : graph.get(cur)) {
                    if (check[j] != 1) {
                        check[j] = 1;
                        queue.offer(j);
                    }
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section7_14_MyVer T = new Section7_14_MyVer();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        answer = new int[n + 1];
        check = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int j = 0; j < m; j++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int k = 2; k <= n; k++) System.out.println(k + " : " + answer[k]);
    }
}