package Section3_05;

import java.util.Scanner;

public class Section3_05_Ver2 {
    public int solution(int n){
        int answer=0, sum=0, lt=0;
        int m=n/2+1;
        int[] arr=new int[m];
        for(int i=0; i<m; i++) arr[i]=i+1;
        for(int rt=0; rt<m; rt++){
            sum+=arr[rt];
            if(sum==n) answer++;
            while(sum>n){
                sum-=arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_05_Ver2 t = new Section3_05_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(t.solution(n));
    }
}
