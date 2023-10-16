package Section1_4;

import java.util.*;
public class Section1_4_Ver3 {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			char[] s=x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Section1_4_Ver3 T = new Section1_4_Ver3();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		String[] str=new String[n];
		
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}
