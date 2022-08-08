package Course.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem103 {
    /**
     * [문장 속 단어]
     * 설명
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다.
     *
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
     * 단어를 답으로 합니다.
     *
     *
     * 예시 입력 1
     * it is time to study
     * 예시 출력 1
     * study
     */
    public String solution1(String str) {
        String result = "";

        int min = Integer.MIN_VALUE;
        String[] strings = str.split(" ");
        for (String s : strings) {
            int length = s.length();
            if (length > min) {
                min = length;
                result = s;
            }
        }
        return result;
    }

    public String solution2(String str) {
        String result = "";

        int min = Integer.MIN_VALUE;
        int pos = 0;
        while ((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            int length = temp.length();
            if (length > min) {
                min = length;
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Problem103 T = new Problem103();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution1(str));
        System.out.println(T.solution2(str));
    }
}