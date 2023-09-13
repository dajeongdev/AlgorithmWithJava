package Java.object2;

class Outer2 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("Outer2.this.value = " + Outer2.this.value);
        }
    }
}
