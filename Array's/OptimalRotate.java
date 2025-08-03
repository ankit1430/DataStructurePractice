import java.util.Arrays;

public class OptimalRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        k = k % n;

        leftRotate(arr, n, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    private static void leftRotate(int[] arr, int n, int k) {
        reverse(arr, 0, k - 1);       
        reverse(arr, k, n - 1);       
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
