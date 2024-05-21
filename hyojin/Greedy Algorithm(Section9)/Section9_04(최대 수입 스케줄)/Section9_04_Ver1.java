package Section9_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int m;
    int d;

    public Lecture(int m, int d) {
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Lecture o) {
        if (o.d == this.d) return o.m - this.m;
        else return o.d - this.d;
    }
}

public class Section9_04_Ver1 {

    static int n, max=Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr){
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(arr.get(j).d<i) break;
                pQ.offer(arr.get(j).m);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }


    public static void main(String[] args){
        Section9_04_Ver1 T = new Section9_04_Ver1();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m=kb.nextInt();
            int d=kb.nextInt();
            arr.add(new Lecture(m, d));
            if(d>max) max=d;
        }
        System.out.println(T.solution(arr));
    }
}
