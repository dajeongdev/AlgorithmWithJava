package algorithm.Array;

import java.util.Scanner;

public class 점수계산 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) { // 점수가 났을 때
                cnt++;
                answer += cnt; // 누적
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        점수계산 T = new 점수계산();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}
