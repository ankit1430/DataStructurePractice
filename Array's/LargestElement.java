public class LargestElement
{
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int largest = arr[0];

        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : "+ largest);
    }
}