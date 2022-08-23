package Course.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem204 {
    /**
     * [피보나치 수열]
     * 설명
     * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     *
     * 입력
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     *
     * 출력
     * 첫 줄에 피보나치 수열을 출력합니다.
     *
     * 예시 입력 1
     * 10
     * 예시 출력 1
     * 1 1 2 3 5 8 13 21 34 55
     */
    public int[] solution1 (int N) {
        int[] result = new int[N];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < 10; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }
        return result;
    }

    public void solution2(int N) {
        int a = 1;
        int b = 1;
        int temp = 0;

        for (int i = 2; i < N; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        Problem204 T = new Problem204();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int num : T.solution1(N)) {
            System.out.print(num + " ");
        }
    }
}
