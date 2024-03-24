import java.util.*;

public class Section5_8_MyVer {
    public int solution(int n, int m, int[] list) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        for(int i = 0; i < n; i++)  queue.offer(new Patient(i, list[i]));

        while(!queue.isEmpty()) {
            Patient current = queue.poll();
            boolean hasHigherPriority = false;

            for(Patient p : queue) {
                if(p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if(hasHigherPriority) {
                queue.offer(current);
            } else {
                answer++;
                if(current.id == m) break;
            }
        }

        return answer;
    }

    static class Patient {
        int id;
        int priority;

        public Patient(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section5_8_MyVer T = new Section5_8_MyVer();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) list[i] = scanner.nextInt();
        System.out.println(T.solution(n, m, list));
    }
}
