package Java.object2;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine); 에러! repair(Repairable in SCV cannot be applied to (Marine).
    }
}
