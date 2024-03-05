package Section2_1;

import java.util.Scanner;

public class Section2_1_MyVer {
    public String solution(int n,int[] array){
        String answer= String.valueOf(array[0]);
        for(int i=1; i<n; i++){
            if(array[i]>array[i-1]) answer+=" "+String.valueOf(array[i]);
    }
        return answer;
    }
    public static void main(String[] args){
        Section2_1_MyVer t = new Section2_1_MyVer();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(t.solution(n,array));
    }
}
