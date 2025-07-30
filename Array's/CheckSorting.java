public class CheckSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        for(int i = 1 ; i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                System.out.println("Array is Sorted");
            }
        }
    }
}
