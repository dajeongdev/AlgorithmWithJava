package Baekjoon.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2869 {
    /**
     * [달팽이는 올라가고 싶다]
     * 문제
     * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
     * 달팽이는 낮에 A미터 올라갈 수 있다.
     * 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
     * 또, 정상에 올라간 후에는 미끄러지지 않는다.
     * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
     *
     * 출력
     * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
     *
     * 예제 입력 1
     * 2 1 5
     * 예제 출력 1
     * 4
     * 예제 입력 2
     * 5 1 6
     * 예제 출력 2
     * 2
     * 예제 입력 3
     * 100 99 1000000000
     * 예제 출력 3
     * 999999901
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        /** 포인트: 정상에 오른 후엔 미끄러지지 않는다. */
        int day = (V - B) / (A - B); // (높이 - 미끄러지는 높이) / (올라가는 높이 + 미끄러지는 높이) 정상에 오르기 전까지의 날짜
        if ((V - B) % (A - B) != 0) day++; // 올라가는 높이보다 정상까지의 높이가 짧을 때 하루 추가
        System.out.println(day);
    }
}
