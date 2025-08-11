import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> ans = new ArrayList<>(); 
        int[] visited = new int[n2];
        for(int i = 0 ;i<n1;i++)
        {
            for(int j = 0 ;j<n2;j++)
            {
                if(arr1[i]==arr2[j]&&visited[j]==0)
                {
                    ans.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if (arr2[j]>arr1[i]) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}