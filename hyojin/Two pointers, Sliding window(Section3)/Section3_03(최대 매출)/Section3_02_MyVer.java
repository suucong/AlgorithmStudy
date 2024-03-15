package Section3_03;

import java.util.Scanner;

public class Section3_02_MyVer {
    public int solution(int n, int k, int[] arr){
        int answer=0;
        for(int i=0; i<n-(k-1); i++){
            int sum=0;
            for(int j=i; i<i+k; j++){
                sum+=arr[j];
            }
            if(sum>answer) answer=sum;
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_02_MyVer t = new Section3_02_MyVer();
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
