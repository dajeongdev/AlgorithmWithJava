package Java.object;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "번입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "번입니다.");

        t2 = t1; // t2가 가지고 있던 값은 잃어버리게 되고, t1이 참조하고 있던 인스턴스를 같이 참조하게 됨
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "번입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "번입니다.");
    }
}
