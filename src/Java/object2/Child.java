package Java.object2;

public class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("x = " + x); // this.x와 같다
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}