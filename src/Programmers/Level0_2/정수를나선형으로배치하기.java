package Programmers.Level0_2;

import java.util.Arrays;

public class 정수를나선형으로배치하기 {
    /**
     *문제 설명
     * 양의 정수 n이 매개변수로 주어집니다.
     * n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
     *
     * 제한사항
     * 1 ≤ n ≤ 30
     *
     * 입출력 예
     * n	result
     * 4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
     * 5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.
     * 행 \ 열	0	1	2	3
     * 0	1	2	3	4
     * 1	12	13	14	5
     * 2	11	16	15	6
     * 3	10	9	8	7
     * 따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.
     * 입출력 예 #2
     * 예제 2번의 n의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.
     * 행 \ 열	0	1	2	3	4
     * 0	1	2	3	4	5
     * 1	16	17	18	19	6
     * 2	15	24	25	20	7
     * 3	14	23	22	21	8
     * 4	13	12	11	10	9
     * 따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]를 return 합니다.
     */
    public int[][] solution(int n) {
        // n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치
        int[][] answer = new int[n][n];
        int count = 1;
        int row = 0;
        int col = 0;
        int direction = 0; // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽

        while (count <= n * n) {
            answer[row][col] = count++;

            if (direction == 0) { // 오른쪽
                if (col == n - 1 || answer[row][col + 1] != 0) { // 마지막 열이거나 다음 열의 값이 0이 아님
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) { // 아래쪽
                if (row == n - 1 || answer[row + 1][col] != 0) { // 마지막 행이거나 다음 열의 값이 0이 아님
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) { // 왼쪽
                if (col == 0 || answer[row][col - 1] != 0) { // 첫 열이거나 마지막 열의 값이 0이 아님
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) { // 위쪽
                if (row == 0 || answer[row - 1][col] != 0) { // 첫 행이거나 이전 열의 값이 0이 아님
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        정수를나선형으로배치하기 T = new 정수를나선형으로배치하기();

        System.out.println(Arrays.deepToString(T.solution(4)));
        System.out.println(Arrays.deepToString(T.solution(5)));
    }
}
