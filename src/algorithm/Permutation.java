package algorithm;

// 순열 : n개 중에서 r개를 순서있게 뽑기
// 시간 복잡도: O(n!)
public class Permutation {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

//        permutation2(arr, output, visited, 0, n, 3);
        permutation1(arr, 0, n, 3);
    }

    static void permutation2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            printArr(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation2(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }

    private static void printArr(int[] output, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }

    static void permutation1(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            printArr(arr, r);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation1(arr, depth + 1, n , r);
            swap (arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}