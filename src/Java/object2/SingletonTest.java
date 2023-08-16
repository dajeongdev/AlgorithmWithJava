package Java.object2;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton(); // error!
        Singleton s = Singleton.getInstance();
    }
}
