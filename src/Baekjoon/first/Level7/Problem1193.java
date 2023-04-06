package Baekjoon.first.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1193 {
    /**
     * [분수 찾기]
     * 문제
     * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
     *
     * 1/1	1/2	1/3	1/4	1/5	…
     * 2/1	2/2	2/3	2/4	…	…
     * 3/1	3/2	3/3	…	…	…
     * 4/1	4/2	…	…	…	…
     * 5/1	…	…	…	…	…
     * …	…	…	…	…	…
     * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
     *
     * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
     *
     * 출력
     * 첫째 줄에 분수를 출력한다.
     *
     * 예제 입력 1
     * 1
     * 예제 출력 1
     * 1/1
     * 예제 입력 2
     * 2
     * 예제 출력 2
     * 1/2
     * 예제 입력 3
     * 3
     * 예제 출력 3
     * 2/1
     * 예제 입력 4
     * 4
     * 예제 출력 4
     * 3/1
     * 예제 입력 5
     * 5
     * 예제 출력 5
     * 2/2
     * 예제 입력 6
     * 6
     * 예제 출력 6
     * 1/3
     * 예제 입력 7
     * 7
     * 예제 출력 7
     * 1/4
     * 예제 입력 8
     * 8
     * 예제 출력 8
     * 2/3
     * 예제 입력 9
     * 9
     * 예제 출력 9
     * 3/2
     * 예제 입력 10
     * 14
     * 예제 출력 10
     * 2/4
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross = 1;
        int sum = 0;

        while (true) {
            // 직선 대각선 누적합 + 해당 대각선 갯수를 이용한 범위 판별
            if (X <= sum + cross) {
                if (cross % 2 == 1) { // 대각선의 갯수가 홀수
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 갯수 - (X번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X번째 - 직전 대각선까지의 누적합
                    System.out.print((cross - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else { // 대각선의 개수가 짝수
                    // 홀수일 때의 반대
                    System.out.print((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            } else {
                sum += cross;
                cross++;
            }
        }
    }
}
