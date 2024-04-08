package Section6_05;

import java.util.HashMap;
import java.util.Scanner;

public class Section6_05_MyVer {
    public char solution(int n, int[] arr) {
        char answer = 'U';
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])) return 'D';
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section6_05_MyVer t = new Section6_05_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }
}
