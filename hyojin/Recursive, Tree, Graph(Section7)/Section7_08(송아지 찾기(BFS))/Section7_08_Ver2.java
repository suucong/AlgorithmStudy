package Section7_08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section7_08_Ver2 {

    int[] dis = {1, -1, 5};
    int[] ch;  //한번 들어간 숫자는 안 넣겠다.

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) return L;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 1000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Section7_08_Ver2 t = new Section7_08_Ver2();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(t.BFS(s, e));
    }
}
