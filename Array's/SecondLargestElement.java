public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int largest = arr[0];
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]>secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is : " + secondLargest);
    }
}
