package Section6_04;

import java.util.*;

public class Section6_04_MyVer {
    public ArrayList<Integer> solution(int n, int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(arr[i])) {  // 캐시에 이미 있다면
                for (int j = 0; j < answer.size(); j++) {
                    if (answer.get(j) == arr[i]) {
                        answer.remove(j);
                        answer.add(arr[i]);
                        break;
                    }
                }
            } else {  // 캐시에 없다면 새로 넣기
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                answer.add(arr[i]);
            }
            if (answer.size() > n) {  // 캐시 크기 넘었을 때
                answer.remove(0);
                map.remove(answer.get(0));
            }
        }
        Collections.reverse(answer);
        return answer;
    }

    public static void main(String[] args) {
        Section6_04_MyVer t = new Section6_04_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : t.solution(n, m, arr)) System.out.print(x + " ");
    }
}
