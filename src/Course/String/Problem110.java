package Course.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem110 {
    /**
     * [가장 짧은 문자 거리]
     * 설명
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     * 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     *
     * 예시 입력 1
     * teachermode e
     * 예시 출력 1
     * 1 0 1 2 1 0 1 2 2 1 0
     */
    public int[] solution(String s) {
        String[] split = s.split(" ");
        char t = s.charAt(s.length() - 1);
        s = split[0];

        int[] result = new int[s.length()];
        int dis = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                dis = 0;
                result[i] = dis;
            } else {
                dis++;
                result[i] = dis;
            }
        }

        dis = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                dis = 0;
            } else {
                dis++;
                result[i] = Math.min(result[i], dis);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Problem110 T = new Problem110();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int num : T.solution(str)) {
            System.out.print(num + " ");
        }
    }
}
