package arraylist;
import java.util.ArrayList;

public class multidimensional {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(3);
        list2.add(4);

        mainlist.add(list1);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> temp=mainlist.get(i);
            for(int j=0;j<temp.size();j++)
            {
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }


        ArrayList<ArrayList<Integer>> mainlist2=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();

        for(int i=1;i<6;i++)
        {
            l1.add(1*i);
            l2.add(2*i);
            l3.add(3*i);

        }

        mainlist2.add(l1);
        mainlist2.add(l2);
        mainlist2.add(l3);
        System.out.println(mainlist2);

        //multidimensional arraylist can be variable length

        l1.remove(3);
        System.out.println(mainlist2);


    }

}
