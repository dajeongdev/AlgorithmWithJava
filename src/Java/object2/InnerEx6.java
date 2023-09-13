package Java.object2;

class InnerEx6 {
    Object iv = new Object() { // 익명 클래스
        void method() {}
    };

    static Object cv = new Object() { // 익명 클래스
      void method() {}
    };

    void myMethod() {
        Object lv = new Object() { // 익명 클래스
            void method() {}
        };
    }
}
