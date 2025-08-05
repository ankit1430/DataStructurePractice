// Brute force approach to move all zeros to the end of the array.
// Step 1: Create a temporary array initialized with zeros (by default).
// Step 2: Iterate through the original array, and copy all non-zero elements into the temp array.
// Step 3: Copy the temp array back into the original array.
// This way, all non-zero elements remain at the front, and zeros shift to the end.
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for(int i = 0 ;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        for(int j = 0; j<n;j++)
        {
            arr[j] = temp[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}
