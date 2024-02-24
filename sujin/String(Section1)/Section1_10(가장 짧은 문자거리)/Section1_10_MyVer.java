package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_10_MyVer {
    public String solution(String str1, char c) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        int p = 1000;

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == c) {
                p = 0;
                integerArrayList.add(p);
            } else {
                integerArrayList.add(++p);
            }
        }

        p = 1000;

        for(int i = str1.length()-1; i >= 0; i--) {
            if(str1.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                if(integerArrayList.get(i) > p)
                    integerArrayList.set(i, Math.min(integerArrayList.get(i), p));
            }

            answer.insert(0, integerArrayList.get(i) + " ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section1_10_MyVer T = new Section1_10_MyVer();
        String str1 = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(T.solution(str1, c));
    }
}