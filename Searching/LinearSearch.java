import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6,7,8,4,1};
        System.out.println("Enter the targeted number");
        int target = sc.nextInt();

        int result = doSearching(arr,target);
        if(result == -1)
        {
            System.out.println("Not Found in Array's");
        }
        else
        {
            System.out.println("Found in Array's at " + result + " index");
        }
    }

    private static int doSearching(int[] arr, int target) {
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
