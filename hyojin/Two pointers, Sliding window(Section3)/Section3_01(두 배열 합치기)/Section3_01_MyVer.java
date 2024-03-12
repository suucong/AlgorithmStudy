package Section3_01;

import java.util.Scanner;

public class Section3_01_MyVer {
    public int[] solution(int n1, int[] arr1, int n2, int[] arr2){
        int[] answer=new int[n1+n2];
        System.arraycopy(arr1,0,answer,0,n1);
        System.arraycopy(arr2,0,answer,n1,n2);
        int n=n1+n2;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(answer[i]>answer[j]){
                    int tmp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=tmp;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_01_MyVer t = new Section3_01_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=scanner.nextInt();
        }
        for(int x: t.solution(n,arr1,n2,arr2)) System.out.print(x+" ");
    }
}
