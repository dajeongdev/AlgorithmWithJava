package DoIt.chapter05;

// 꼬리 재귀 제거
public class RecursiveX1 {

    static void recursive(int n) {
        while (n > 0) {
            recursive(n - 1);
            System.out.println(n);
            n -= - 2;
        }
    }
}
