package Baekjoon.first.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10757 {
    /**
     * [큰 수 A+B]
     * 문제
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
     *
     * 출력
     * 첫째 줄에 A+B를 출력한다.
     *
     * 예제 입력 1
     * 9223372036854775807 9223372036854775808
     * 예제 출력 1
     * 18446744073709551615
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String strA = st.nextToken();
        String strB = st.nextToken();

        int max = Math.max(strA.length(), strB.length());

        // 마지막 자리수 올림이 있을 수 있으므로 + 1
        int[] A = new int[max + 1];
        for (int i = strA.length() - 1, idx = 0; i >= 0; i--, idx++) {
            A[idx] = strA.charAt(i) - '0'; // 역순으로 하나씩 저장
        }

        // 마지막 자리수 올림이 있을 수 있으므로 + 1
        int[] B = new int[max + 1];
        for (int i = strB.length() - 1, idx = 0; i >= 0; i--, idx++) {
            B[idx] = strB.charAt(i) - '0'; // 역순으로 하나씩 저장
        }

        for (int i = 0; i < max; i++) {
            int value = A[i] + B[i];
            A[i] = value % 10; // 더한 값의 10으로 나눈 나머지가 자리값
            A[i + 1] += (value / 10); // 더한 값의 10으로 나눈 몫이 올림값
        }

        // A 배열 역순 출력
        // 가장 높은 자릿수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
        StringBuilder sb = new StringBuilder();
        if (A[max] != 0) {
            sb.append(A[max]);
        }

        for (int i = max - 1; i >= 0; i--) {
            sb.append(A[i]);
        }
        System.out.println(sb);
    }
}
