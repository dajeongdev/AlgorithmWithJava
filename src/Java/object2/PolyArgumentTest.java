package Java.object2;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Audio());

        System.out.println("현재 남은 돈은 " + b.money + "입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "입니다");
    }
}
