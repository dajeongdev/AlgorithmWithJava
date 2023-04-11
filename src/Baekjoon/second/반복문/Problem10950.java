package Baekjoon.second.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10950 {
    /**
     * [A + B - 3]
     * 문제
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     *
     * 출력
     * 각 테스트 케이스마다 A+B를 출력한다.
     *
     * 예제 입력 1
     * 5
     * 1 1
     * 2 3
     * 3 4
     * 9 8
     * 5 2
     * 예제 출력 1
     * 2
     * 5
     * 7
     * 17
     * 7
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            if (i < length - 1) sb.append("\n");
        }
        System.out.println(sb);
    }
}