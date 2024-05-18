package Section9_01;

import java.util.Scanner;

class Person {
    int h;
    int w;
    public Person(int h, int w) {
        this.h = h;
        this.w = w;
    }
}
public class Section9_01_MyVer {

    public int solution(int n, Person[] applicants) {
        int answer=0;
        for (Person p: applicants) {
            boolean flag = true;
            for (Person a : applicants) {
                if(a.h > p.h && a.w> p.w) {
                    flag = false;
                }
                if(!flag) break;
            }
            if(flag) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        Section9_01_MyVer t = new Section9_01_MyVer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] applicants = new Person[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            applicants[i] = new Person(h, w);
        }

        System.out.println(t.solution(n, applicants));
    }
}
