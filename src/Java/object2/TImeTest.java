package Java.object2;

public class TImeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        // t.hour = 13; 에러! 변수 hour의 접근 제어자가 private이므로 접근할 수 없음
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}