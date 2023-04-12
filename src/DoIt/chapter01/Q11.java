package DoIt.chapter01;

public class Q11 {

    static String length(int n) {
        return "그 수는 " + (String.valueOf(n).length()) + "자리입니다.";
    }
    public static void main(String[] args) {
        System.out.println(length(135));
        System.out.println(length(1314));
    }
}
