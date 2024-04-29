package Section7_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section7_14_MyVer {

    static ArrayList<ArrayList<Integer>> graph;
    static int[] answer, ch;

    public static void BFS(int val) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(val);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int cur = q.poll();
                answer[cur] = L;
                ArrayList<Integer> curList = graph.get(cur);
                for (int j = 0; j < curList.size(); j++) {
                    if (ch[curList.get(j)] == 0) {
                        q.offer(curList.get(j));
                        ch[curList.get(j)] = 1;
                    }

                }
            }
            L++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ch = new int[n + 1];
        answer = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + answer[i]);
        }
    }
}

