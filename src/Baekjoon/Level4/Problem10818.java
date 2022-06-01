package Baekjoon.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10818 {
    /**
     * [최소, 최대]
     * 문제
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
     *
     * 출력
     * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
     *
     * 예제 입력 1
     * 5
     * 20 10 35 30 7
     * 예제 출력 1
     * 7 35
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        br.close();

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }

    /**
     * 배열을 사용하면 메모리 비용이 들고, 최악의 경우 시간복잡도가 N^2이기 때문에 불필요하게 시간이 낭비된다.
     * 그래서 배열이 사용하지 않고 입력받은 문자를 즉시 비교하는 다른 풀이가 있어 참고용으로 남겨둔다.
     */
    public void otherAnswer(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());	// 첫 줄 N은 안쓰이므로 입력만 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }
}