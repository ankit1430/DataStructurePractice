public class OptimalFindMissing {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int n = arr.length;
        int sum = (n * (n+1) ) / 2;
        int sum2 = 0;
        for(int i = 0 ;i<n;i++)
        {
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum-sum2);
    }
}
