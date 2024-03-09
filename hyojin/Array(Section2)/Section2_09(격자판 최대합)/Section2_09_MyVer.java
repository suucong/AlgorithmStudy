package Section2_09;

import java.util.Map;
import java.util.Scanner;

public class Section2_09_MyVer {
    public int solution(int n, int[][] array){
        int answer=0;
        int sum1,sum2,sum3=0, sum4=0;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            sum3+=array[i][i];
            sum4+=array[i][n-1-i];
            for(int j=0; j<n; j++){
                sum1+=array[i][j];
                sum2+=array[j][i];
            }
            if(Math.max(sum1,sum2) >answer) answer=Math.max(sum1,sum2);
        }
        answer=Math.max(sum3,answer);
        answer=Math.max(sum4,answer);
        return answer;
    }

    public static void main(String[] args){
        Section2_09_MyVer t = new Section2_09_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] array=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,array));
    }
}
