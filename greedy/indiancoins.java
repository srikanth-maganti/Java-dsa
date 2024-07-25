package greedy;
import java.util.*;

public class indiancoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        int amount=590;
        int countofcoins=0;
        
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> arr=new ArrayList<>();


        for(int i=0;i<coins.length;i++)
        {
            while(coins[i]<=amount)
            {
                amount-=coins[i];
                arr.add(coins[i]);
                countofcoins++;

                
            }

        }
        System.out.println(countofcoins);
        System.out.println(arr);
    }
}
