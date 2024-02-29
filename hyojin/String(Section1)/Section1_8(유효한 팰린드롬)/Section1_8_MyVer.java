package Section1_8;

import java.util.Scanner;

public class Section1_8_MyVer {
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        String[] array=str.split(" ");
        int len=array.length;
        for(int i=0; i<len; i++){
            int lt=0, rt= array[len-i-1].length()-1;
            while(lt<rt){
                if(!Character.isAlphabetic(array[i].charAt(lt))) lt++;
                else if (!Character.isAlphabetic(array[len-i-1].charAt(rt))) rt--;
                else if(array[i].charAt(lt)!=array[len-1-i].charAt(rt)) return "NO";
                else if(array[i].charAt(lt)==array[len-1-i].charAt(rt)){
                    rt--;
                    lt++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_8_MyVer t = new Section1_8_MyVer();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(t.solution(str));
    }
}
