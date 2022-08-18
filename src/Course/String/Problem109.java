package Course.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem109 {
    /**
     * [숫자만 추출]
     * 설명
     * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
     * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
     * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
     *
     * 입력
     * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
     *
     * 출력
     * 첫 줄에 자연수를 출력합니다.
     *
     * 예시 입력 1
     * g0en2T0s8eSoft
     * 예시 출력 1
     * 208
     */
    public int solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public int otherAnswer1(String str) {
        int result = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                result = result * 10 + (x - 48);
            }
        }
        return result;
    }

    public int otherAnswer2(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                result += x;
            }
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) throws IOException {
        Problem109 T = new Problem109();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.otherAnswer2(str));
    }
}
