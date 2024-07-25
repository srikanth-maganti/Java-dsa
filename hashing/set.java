import java.util.*;
public class set {
    public static void main(String[] args) {
        //hashmap
        HashSet<String> hm=new HashSet<>();
        hm.add("india");
        hm.add("america");
        hm.add("africa");
        hm.add("bangladesh");

        System.out.println(hm);
        //iterator
        Iterator it=hm.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //for each
        for(String s:hm)
        {
            System.out.println(s);
        }


        System.out.println(hm.contains("india"));
        System.out.println(hm.remove("india"));


        //linkedhashset
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("india");
        lhs.add("america");
        lhs.add("africa");
        lhs.add("bangladesh");

        System.out.println(lhs);

        //treeset
        TreeSet<String> ts=new TreeSet<>();
        ts.add("india");
        ts.add("america");
        ts.add("africa");
        ts.add("bangladesh");
        System.out.println(ts);
    }
}
