package Section9_08;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int vex;
    int cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Section9_08_Ver1 {

    static int n, m;
    static int[] ch;
    static ArrayList<ArrayList<Edge>> arr;

    public int solution(int v) {
        int answer = 0;
        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(v, 0));
        while (!q.isEmpty()) {
            Edge tmp = q.poll();
            int vex = tmp.vex;
            if (ch[vex] == 0) {
                ch[vex] = 1;
                answer += tmp.cost;
                for (Edge o : arr.get(vex)) {
                    if (ch[o.vex] == 0) q.add(new Edge(o.vex, o.cost));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section9_08_Ver1 t = new Section9_08_Ver1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        arr = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) arr.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            arr.get(a).add(new Edge(b, cost));
            arr.get(b).add(new Edge(a, cost));
        }
        System.out.println(t.solution(1));
    }

}
