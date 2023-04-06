package Baekjoon.first.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1929 {
    /**
     * [소수 구하기]
     * 문제
     * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
     *
     * 출력
     * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
     *
     * 예제 입력 1
     * 3 16
     * 예제 출력 1
     * 3
     * 5
     * 7
     * 11
     * 13
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int M = Integer.parseInt(num[0]);
        int N = Integer.parseInt(num[1]);

        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[N + 1];

        for(int i = 2; i <= N; i++) {
            if (prime[i]) continue;

            if (i >= M) sb.append(i).append('\n');

            for (int j = i + i; j <= N; j += i) {
                prime[j] = true;
            }
        }

        System.out.println(sb);
     }
}
