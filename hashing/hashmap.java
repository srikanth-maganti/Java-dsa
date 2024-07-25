import java.util.*;
public class hashmap
{
    public static void main(String[] args) {
        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("india",150);
        hm.put("china",180);
        hm.put("africa",100);
        hm.put("america",50);

        System.out.println(hm);
       System.out.println( hm.get("india"));
       System.out.println(hm.get("indonesia"));


       System.out.println(hm.containsKey("india"));
       System.out.println(hm.containsKey("indonesia"));

       System.out.println(hm.isEmpty());
       System.out.println(hm.remove("india"));
       System.out.println(hm);
       System.out.println(hm.remove("indonesia"));
       System.out.println(hm);

    //    hm.clear();
       System.out.println(hm);


       //iterate 
       Set<String> keys=hm.keySet();
       for(String k:keys)
       {
        System.out.println(hm.get(k));
       }


       //linkedhashmap
       //order
       LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
       lhm.put("india",100);
       lhm.put("america",200);
       lhm.put("us",300);

       System.out.println(lhm);

       //treemap 
       //sorted key
       TreeMap<String,Integer> tm=new TreeMap<>();
       tm.put("india",100);
       tm.put("america",200);
       tm.put("us",300);

       System.out.println(tm);


    }
}