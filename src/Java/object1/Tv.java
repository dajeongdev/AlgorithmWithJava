package Java.object1;

public class Tv {
    // TV의 속성(멤버 변수)
    String color;  // 색상
    boolean power; // 전원 상태 (on/off)
    int channel;   // 채널

    // Tv의 기능
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}