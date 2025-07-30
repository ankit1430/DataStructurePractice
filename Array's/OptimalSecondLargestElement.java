public class OptimalSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest is " + secondLargest);
    }
}
