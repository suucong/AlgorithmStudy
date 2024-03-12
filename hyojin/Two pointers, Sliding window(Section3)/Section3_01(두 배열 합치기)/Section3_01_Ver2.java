package Section3_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Section3_01_Ver2 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
    public static void main(String[] args){
        Section3_01_Ver2 t = new Section3_01_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=scanner.nextInt();
        }
        for(int x: t.solution(n,n2,arr1,arr2)) System.out.print(x+" ");
    }
}
