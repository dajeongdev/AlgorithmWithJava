package Course.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem203 {
    /**
     * [가위 바위 보]
     * 설명
     * A, B 두 사람이 가위바위보 게임을 합니다.
     * 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
     * 비길 경우에는 D를 출력합니다.
     * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
     *
     * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     *
     * 출력
     * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
     *
     * 예시 입력 1
     * 5
     * 2 3 3 1 3
     * 1 1 2 2 3
     * 예시 출력 1
     * A
     * B
     * A
     * B
     * D
     */
    public String[] solution(int N, String strA, String strB) {
        String[] result = new String[N];

        String[] A = strA.split(" ");
        String[] B = strB.split(" ");

        for (int i = 0; i < N; i++) {
            if (A[i].equals(B[i])) {
                result[i] = "D";
            } else if (("2".equals(A[i]) && "1".equals(B[i]))
                    || ("1".equals(A[i]) && "3".equals(B[i]))
                    || ("3".equals(A[i]) && "2".equals(B[i]))) {
                result[i] = "A";
            } else {
                result[i] = "B";
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Problem203 T = new Problem203();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();

        for (String result : T.solution(N, A, B)) {
            System.out.println(result);
        }
    }
}
