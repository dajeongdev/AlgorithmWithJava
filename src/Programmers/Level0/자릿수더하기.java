package Programmers.Level0;

public class 자릿수더하기 {
    /**
     * 문제 설명
     * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
     *
     * 제한사항
     * 0 ≤ n ≤ 1,000,000
     * 입출력 예
     * n	result
     * 1234	10
     * 930211	16
     * 입출력 예 설명
     * 입출력 예 #1
     *
     * 1 + 2 + 3 + 4 = 10을 return합니다.
     * 입출력 예 #2
     *
     * 9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
     */
    public int solution(int n) {
        int answer = 0;
        String[] split = String.valueOf(n).split("");
        for (String str : split) answer += Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 T = new 자릿수더하기();

        System.out.println(T.solution(1234));
        System.out.println(T.solution(930211));

        System.out.println(T.otherSolution(1234));
        System.out.println(T.otherSolution(930211));
    }

    public int otherSolution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 10의 자리씩 더하기
            n /= 10;
        }
        return answer;
    }
}
