package Section2_04;

import java.util.Scanner;

public class Section2_04_MyVer {
    public int[] solution(int n){
        int [] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2; i<n; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }

    public static void main(String[] args){
        Section2_04_MyVer t = new Section2_04_MyVer();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int x: t.solution(n)) System.out.print(x+" ");
    }
}
