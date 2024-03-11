package Section2_11;

import java.util.Scanner;

public class Section2_11_MyVer {
    public int solution(int n, int[][] arr){
        int answer=0;
        int[][] stu=new int[n][n];
        for(int i=0; i<5; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++) {
                    if (arr[j][i] == arr[k][i] && j != k) stu[j][k]=1;
                }
            }
        }
        int max=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<n;j++){
                sum+=stu[i][j];
            }
            if(max<sum){
                max=sum;
                answer=i+1;
            }
        }
        if(answer==0) answer=1;
        return answer;
    }
    public static void main(String[] args){
        Section2_11_MyVer t = new Section2_11_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,arr));
    }
}
