package Section2_12;

import java.util.Scanner;

public class Section2_12_MyVer {
    public int solution(int n, int m, int[][] arr){
        int answer=0;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int p1=0, p2=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) p1=s;
                        if(arr[k][s]==j) p2=s;
                    }
                    if(p1<p2) cnt++;
                }
                if(cnt==m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_12_MyVer t = new Section2_12_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(t.solution(n,m,arr));
    }
}
