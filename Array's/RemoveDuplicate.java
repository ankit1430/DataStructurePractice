import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr)
        {
            set.add(num);
        } 
        int[] result = new int[set.size()];
        int i = 0 ;
        for(int num : set)
        {
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
    }
}
