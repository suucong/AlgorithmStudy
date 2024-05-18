package Section9_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Section9_02_Ver2 {

    public int solution(int n, ArrayList<Meeting> arr) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Meeting ob : arr) {
            if (ob.start >= et) {
                cnt++;
                et = ob.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Section9_02_Ver2 t = new Section9_02_Ver2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Meeting(start, end));
        }
        System.out.println(t.solution(n, arr));
    }
}
