import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr1)
        {
            set.add(num);
        }
        for(int num : arr2)
        {
            set.add(num);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for(int num : set)
        {
            union[i++] = num;
        }
        System.out.println(Arrays.toString(union));
    }
}
