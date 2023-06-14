package Programmers.Level1_2;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    /**
     * 문제 설명
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
     * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     *
     * 제한 조건
     * n은 10,000,000,000이하인 자연수입니다.
     *
     * 입출력 예
     * n	return
     * 12345	[5,4,3,2,1]
     */
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0, j = answer.length-1; i < answer.length; i++) {
            String temp = String.valueOf(str.charAt(j--));
            answer[i] = Integer.parseInt(temp);
        }
        return answer;
    }

    public int[] otherSolution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 T = new 자연수뒤집어배열로만들기();

        System.out.println(Arrays.toString(T.solution(12345)));
        System.out.println(Arrays.toString(T.otherSolution(12345)));
    }
}
