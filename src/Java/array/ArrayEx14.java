package Java.array;

public class ArrayEx14 {

    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"): " + ch);
        }

        // String -> char[]
        char[] chArr = src.toCharArray();
        // char 배열 출력
        System.out.println(chArr);
    }
}
