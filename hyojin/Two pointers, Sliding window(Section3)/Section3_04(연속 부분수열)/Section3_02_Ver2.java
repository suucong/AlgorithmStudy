package Section3_04;

import java.util.Scanner;

public class Section3_02_Ver2 {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        int lt=0, sum=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_02_Ver2 t = new Section3_02_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(t.solution(n,m,arr));
    }
}
