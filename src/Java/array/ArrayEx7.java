package Java.array;

// 섞기(shuffle)_1
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int temp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }

        for (int i = 0; i < numArr.length; i++)
            System.out.print(numArr[i]);
    }
}
