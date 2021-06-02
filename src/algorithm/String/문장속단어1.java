package algorithm.String;

import java.util.Scanner;

public class 문장속단어1 {
    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s) {
            int len = x.length();
            if(len > m) { // 최댓값(제일 긴 단어) 구하기
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문장속단어1 T = new 문장속단어1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
