import java.util.Arrays;
import java.util.Scanner;

public class Bubble
{
    private static void bubble_sort(int[] arr)
    {
        int n = arr.length;
        for(int i = n-1 ;i>=1;i--)
        {
            int didSwap = 0;
            for(int j = 0 ;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
            {
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close(); 
    }
}
