import java.util.*;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {12,46,24,52,20,9};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<=n-2;i++)
        {
            
            int min = i;
            for(int j = i ;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
