package Section2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_1_Ver2 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=0; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        Section2_1_Ver2 t = new Section2_1_Ver2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        for(int x: t.solution(n,array)){
            System.out.print(x+" ");
        }
    }
}
