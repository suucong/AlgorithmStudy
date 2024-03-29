package Section5_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section5_6_Ver2 {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        while(!q.isEmpty()){
            for(int i=1; i<k; i++)q.offer(q.poll());
            q.poll();
            if(q.size()==1) answer = q.poll();
        }
        return answer;

    }
    public static void main(String[] args) {
        Section5_6_Ver2 t = new Section5_6_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(t.solution(n, k));
    }
}
