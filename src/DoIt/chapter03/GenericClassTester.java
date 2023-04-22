package DoIt.chapter03;

// 제네릭 클래스의 예시
public class GenericClassTester {

    // 제네릭 클래스의 파라미터를 T라고 작성
    static class GenericClass<T> {
        private T xyz;

        public GenericClass(T xyz) { // 생성자
            this.xyz = xyz;
        }

        public T getXyz() { // xyz를 반환
            return xyz;
        }
    }

    public static void main(String[] args) {
        // 다음과 같이 파라미터에 String을 넣을 수도 있고, Integer를 넣을 수도 있음
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
