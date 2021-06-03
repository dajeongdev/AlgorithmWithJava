package algorithm.Array;

import java.util.Scanner;

public class 등수구하기 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            if(arr[i] < arr[i + 1]) {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        등수구하기 T = new 등수구하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
