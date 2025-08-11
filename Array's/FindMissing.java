public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = arr.length;
        System.out.println(missing(arr, n));
    }

    private static int missing(int[] arr, int n) {
        for (int i = 0; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) { 
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return n;
    }
}
