package algorithm.Array;

import java.util.Scanner;

public class 소수 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                answer++;
                for(int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수 T = new 소수();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.print(T.solution(n));
    }
}
