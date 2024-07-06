package arraylist;
import java.util.ArrayList;
import java.util.Collections;


public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        //decending order --by using comparator function which defines logic
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
