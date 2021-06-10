package algorithm.String2;

import java.util.Scanner;

public class 문장속단어 {
    public String solution(String str) {
        String answer = "";

        int n = Integer.MIN_VALUE; // 최솟값
        String[] s = str.split(" "); // 공백 기준 자르기

        for(String x : s) { // 자른 단어 대입
            int len = x.length();
            if(len > n) { // 최솟값 보다 크다면 (길이가 같은 경우 앞 단어)
                n = len; // 최솟값 대체
                answer = x; // 해당 단어
            }
        }
        return answer;
    }
    /*
    public String solution(String str) {
        String answer = "";
        int n = Integer.MIN_VALUE, pos;

        while((pos.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if(len > n) {
                n = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > 0) {
            answer = str;
        }
        return answer;
    }
    */

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
