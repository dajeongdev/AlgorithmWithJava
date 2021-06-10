package algorithm.String;

import java.util.Scanner;

public class 문장속단어2 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(" ")) != -1) { // 띄어쓰기가 없을 때까지 반복
            String tmp = str.substring(0, pos); // 0번부터 pos 전까지
            int len = tmp.length();

            if (len > m) { // 길이가 긴 단어가 여러 개인 경우 맨 앞쪽 단어 선택
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); // 다음 공백으로 넘어가기
        }
        if(str.length() > m) { // 마지막 단어 적용 (마지막 단어는 뒤에 공백이 없음)
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        문장속단어2 T = new 문장속단어2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
