package DoIt.chapter02;

import java.util.Random;

public class Q1 {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = rand.nextInt(11);
        System.out.println("사람 수: " + num);

        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 0부터 89까지의 난수
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
