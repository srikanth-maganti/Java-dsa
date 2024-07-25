import java.util.*;
public class union_intersect {
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        int arr2[]={3,4,5};

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        System.out.println(set.size());

        //intersection
        set.clear();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);

        }
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }

        }
        System.out.println(count);

    }
}
