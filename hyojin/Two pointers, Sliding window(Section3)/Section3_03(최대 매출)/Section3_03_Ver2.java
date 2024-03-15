package Section3_03;

import java.util.Scanner;

public class Section3_03_Ver2 {
    public int solution(int n, int k, int[] arr){
        int sum=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        int answer=sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer,sum);
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_03_Ver2 t = new Section3_03_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(t.solution(n,k,arr));
    }
}
