package arraylist;
import java.util.ArrayList;
public class arraylist { 
    public static void maximum(ArrayList<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);
    }

    public static void printrev(ArrayList<Integer> list)
    {
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }

    public static void swap(int idx1,int idx2,ArrayList<Integer> list)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(4);
            list.add(5);
            list.add(2,3);
            System.out.println(list);

            System.out.println(list.get(2));

            list.remove(2);
            System.out.println(list);

            list.set(2,8);
            System.out.println(list);

            System.out.println(list.contains(1));

            maximum(list);
            printrev(list);

            int idx1=2,idx2=3;
            swap(idx1,idx2,list);
    }


}
