package Section5_8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Section5_8_MyVer {

    static class Person {
        int num;
        int risk;

        public Person(int num, int risk) {
            this.num = num;
            this.risk = risk;
        }
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Person p = new Person(i, arr[i]);
            q.offer(p);
        }
        while (!q.isEmpty()) {
            Person p = q.poll();
            boolean flag = false;
            for (Person x : q) {
                if (p.risk < x.risk) {
                    q.offer(p);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer++;
                if (p.num == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_8_MyVer t = new Section5_8_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, m, arr));
    }
}
