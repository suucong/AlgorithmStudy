package Section9_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) return this.start-o.start;
        return this.end-o.end;
    }
}
public class Section9_02_MyVer {

    public int solution(int n, ArrayList<Meeting> arr) {
        int cnt = 1;
        Collections.sort(arr);
        int end = arr.get(0).end;
        for (int i=1; i<n; i++) {
            if(end <= arr.get(i).start){
                cnt++;
                end = arr.get(i).end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Section9_02_MyVer t = new Section9_02_MyVer();
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
