package Section5_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int num;
    int risk;

    public Person(int num, int risk) {
        this.num = num;
        this.risk = risk;
    }
}

public class Section5_8_Ver2 {

    private int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(new Person(1, arr[i]));
        }
        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                if (x.risk > tmp.risk) {
                    q.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.num == m) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section5_8_Ver2 t = new Section5_8_Ver2();
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
