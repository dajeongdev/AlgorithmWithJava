package Java.object2;

public class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125); // Dropship의 HP는 125다.
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Dropship";
    }
}
