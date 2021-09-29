package algorithm2.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 문장속단어 {
    /**
     * 설명
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다.
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
     * 단어를 답으로 합니다.
     */
    public String solution(String str) {
        String answer = "";
        int value = Integer.MIN_VALUE;
        String[] words = str.split(" ");

        for(String s : words) {
            int length = s.length();
            if (length > value) {
                value = length;
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
