package Section1_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_10_MyVer {
    public int[] solution(String str, char c){
        char [] array=str.toCharArray();
        int p=1000;
        int[] answer = new int[array.length];
        for(int i=0; i<array.length;i++){
            if(array[i]==c) {
                p=0;
                answer[i]=p;
            }
            else if(array[i]!=c){
                p+=1;
                answer[i]=p;
            }
        }
        for(int j=array.length-1; j>=0; j--){
            if(array[j]==c) {
                p=0;
                if(array[j]>p) answer[j]=p;
            }
            else if(array[j]!=c) {
                p+=1;
                if(array[j]>p) answer[j]=p;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Section1_10_MyVer t = new Section1_10_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(t.solution(str, c));
    }
}
