package Java.object2;

public class Tv extends Product {
    boolean power; // 전원 상태 (on/off)
    int channel;   // 채널

    public Tv() {
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    @Override
    public String toString() {
        return "Tv";
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() { --channel; }
}