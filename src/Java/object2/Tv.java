package Java.object2;

public class Tv {
    boolean power; // 전원 상태 (on/off)
    int channel;   // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() { --channel; }
}