package Programmers.Level1_2;


import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    /**
     * 문제 설명
     * 함수 solution은 정수 n을 매개변수로 입력받습니다.
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를 들어 n이 118372면 873211을 리턴하면 됩니다.
     *
     * 제한 조건
     * n은 1이상 8000000000 이하인 자연수입니다.
     *
     * 입출력 예
     * n	return
     * 118372	873211
     */
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 T = new 정수내림차순으로배치하기();

        System.out.println(T.solution(118372));
    }
}
