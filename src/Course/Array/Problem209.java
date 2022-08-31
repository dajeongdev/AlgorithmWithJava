package Course.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem209 {
    /**
     * [격자판 최대합]
     * 설명
     * 5*5 격자판에 아래와 같이 숫자가 적혀있습니다.
     * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력합니다.
     *
     * 입력
     * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다.
     * 각 자연수는 100을 넘지 않는다.
     *
     * 출력
     * 최대합을 출력합니다.
     *
     * 예시 입력 1
     * 5
     * 10 13 10 12 15
     * 12 39 30 23 11
     * 11 25 50 53 15
     * 19 27 29 37 27
     * 19 13 30 13 19
     * 예시 출력 1
     * 155
     */
    public int solution(int N, int[][] arr) {
        int result = Integer.MIN_VALUE;
        int rowSum = 0; // 행
        int colSum = 0; // 열

        /** 각 행렬의 최대값 구하기 **/
        for (int i = 0; i < N; i++) {
            rowSum = colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            result = Math.max(result, rowSum);
            result = Math.max(result, colSum);
        }

        /** 대각선의 최대값 구하기 **/
        rowSum = colSum = 0;
        for (int i = 0; i < N; i++) {
            rowSum += arr[i][i];
            colSum += arr[i][N - i - 1];
        }
        result = Math.max(result, rowSum);
        result = Math.max(result, colSum);

        return result;
    }

    public static void main(String[] args) throws IOException {
        Problem209 T = new Problem209();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(T.solution(N, arr));
    }
}
