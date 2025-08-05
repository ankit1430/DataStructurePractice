// Optimal Two Pointer Approach to move all zeros to the end of the array.
// Step 1: Pehle loop se pehla zero ka index find karo (usko 'j' me store karo).
// Step 2: Ab j+1 se array ko traverse karo.
//         - Agar non-zero element mile to usko arr[j] ke saath swap karo.
//         - Swap ke baad j++ kar do taaki next zero position mil jaye.
// Is approach me in-place changes ho rahe hain, extra space use nahi ho raha.

// Time Complexity: O(n) – array sirf 2 baar traverse ho raha hai.
// Space Complexity: O(1) – koi extra array use nahi ho raha.

import java.util.Arrays;

public class OptimalmoveZeroToEnd
{
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;
        int j =  -1;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j = i;
                break;
            }
        }
        for(int i = j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}