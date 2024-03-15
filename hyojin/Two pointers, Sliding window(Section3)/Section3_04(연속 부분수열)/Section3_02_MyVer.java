package Section3_04;

import java.util.Scanner;

public class Section3_02_MyVer {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                if(sum<m)sum+=arr[j];
                else if(sum>m) break;
                else {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_02_MyVer t = new Section3_02_MyVer();
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
