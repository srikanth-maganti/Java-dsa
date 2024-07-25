import java.util.*;
public class uniqueel {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,2,5,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);

        }
        System.out.println(set.size());
    }
}
