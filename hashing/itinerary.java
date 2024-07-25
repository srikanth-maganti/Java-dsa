import java.util.*;
public class itinerary {
    public static String findstart(HashMap<String,String> cities)
    {
        HashMap<String,String> rev=new HashMap<>();
        for(String k:cities.keySet())
        {
            rev.put(cities.get(k),k);
        }
        for(String k:cities.keySet())
        {
            if(!rev.containsKey(k))
            {
                return k;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> cities=new HashMap<>();
        cities.put("chennai","benguluru");
        cities.put("mumbai","delhi");
        cities.put("goa","chennai");
        cities.put("delhi","goa");


        String start=findstart(cities);
        System.out.print(start);
        for(String k:cities.keySet()){
            System.out.print("->"+cities.get(start));
            start=cities.get(start);
        }
    }
}
