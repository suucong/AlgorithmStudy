package Section4_5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Section4_5_Ver2 {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

//        Tset.remove(143);  // 지우기
//        System.out.println(Tset.size()));  // 원소의 개수
//        System.out.println(Tset.first());  // 제일 앞에 있는 원소
//        System.out.println(Tset.last());  // 가장 마지막에 있는 원소
        int cnt=0;
        for(int x: Tset){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section4_5_Ver2 t = new Section4_5_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, k, arr));
    }
}
