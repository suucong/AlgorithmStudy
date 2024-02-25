import java.util.Scanner;


public class Section1_1_MyVer {
    public int solution(String str, String t){
        int answer=0;


        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t.charAt(0)){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Section1_1_MyVer t= new Section1_1_MyVer();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(t.solution(input1,input2));
        return ;
    }
}