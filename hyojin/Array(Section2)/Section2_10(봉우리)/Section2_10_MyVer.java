package Section2_10;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Section2_10_MyVer {
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                int max1,max2;
                max1=Math.max(arr[i][j-1],arr[i][j+1]);
                max2=Math.max(arr[i-1][j],arr[i+1][j]);
                if(Math.max(max1,max2)<arr[i][j]) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Section2_10_MyVer t = new Section2_10_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n+2][n+2];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,arr));
    }
}
