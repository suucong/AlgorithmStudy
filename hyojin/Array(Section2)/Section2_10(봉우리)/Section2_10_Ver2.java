package Section2_10;

import java.util.Scanner;

public class Section2_10_Ver2 {
    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_10_Ver2 t = new Section2_10_Ver2();
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
