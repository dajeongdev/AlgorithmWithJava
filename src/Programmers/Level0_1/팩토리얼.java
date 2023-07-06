package Programmers.Level0_1;

public class 팩토리얼 {
    /**
     * 문제 설명
     * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
     * 예를 들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
     * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
     * i! ≤ n
     *
     * 제한사항
     * 0 < n ≤ 3,628,800
     *
     * 입출력 예
     * n	result
     * 3628800	10
     * 7	3
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 10! = 3,628,800입니다. n이 3628800이므로 최대 팩토리얼인 10을 return 합니다.
     * 입출력 예 #2
     * 3! = 6, 4! = 24입니다. n이 7이므로, 7 이하의 최대 팩토리얼인 3을 return 합니다.
     */
    private int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 10; i > 0; i--) {
            if (factorial(i) <= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int otherSolution(int n) {
        int fac = 1;
        int i = 0;

        while (true) {
            if (fac <= n){
                fac *= i + 1;
                i++;
            } else {
                break;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
        팩토리얼 T = new 팩토리얼();

        System.out.println(T.solution(3628800));
        System.out.println(T.solution(7));
        System.out.println(T.solution(1));
    }
}
