package InflearnJavaCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {
    /**
     * 설명
     * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
     *
     * 출력
     * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
     *
     * 예시 입력 1
     * a#b!GE*T@S
     *
     * 예시 출력 1
     * S#T!EG*b@a
     */
    /**
     * 특수문자는 그대로, 영어만 순서 바꾸기
     */
    public static void main(String[] args) throws IOException {
        특정문자뒤집기 T = new 특정문자뒤집기();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.mySolution(str)); // 132ms
        System.out.println(T.otherSolution(str)); // 113ms
    }

    private String mySolution(String str) {
        StringBuilder alphabet = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabet.append(c);
            }
        }
        alphabet.reverse();

        StringBuilder answer = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            answer.append((Character.isAlphabetic(str.charAt(i))) ? alphabet.charAt(j++) : str.charAt(i));
        }
        return answer.toString();
    }

    private String otherSolution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }
}
