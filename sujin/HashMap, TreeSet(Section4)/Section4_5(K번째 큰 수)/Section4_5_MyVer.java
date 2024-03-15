import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Section4_5_MyVer {
    private int solution(int n, int k, int[] list) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        combination(list, ts, visited, 0, n, 3);

        if(ts.size() < k) {
            answer = -1;
        } else {
            for(int i = 0; i < k-1; i++) {
                ts.remove(ts.first());
            }

            answer = ts.first();
        }

        return answer;
    }

    // 백트래킹 조합
    static void combination(int[] arr, TreeSet<Integer> resultTs,
                            boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            resultTs.add(add(arr, visited, n));
            return;
        }

        for(int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, resultTs, visited,i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static int add(int[] arr, boolean[] visited, int n) {
        int add = 0;
        for (int i = 0; i < n; i++) {
            if(visited[i])  add += arr[i];
        }
        return add;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section4_5_MyVer T = new Section4_5_MyVer();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(T.solution(n, k, list));
    }
}
