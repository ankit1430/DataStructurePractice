import java.util.ArrayList; 
import java.util.List;

public class OptimalIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        int i = 0 , j = 0;
         List<Integer> ans = new ArrayList<>();
        while(i<arr1.length && j <arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }else if(arr2[j]<arr1[i])
            {
                j++;
            }
            else
            {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
