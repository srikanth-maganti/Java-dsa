package arraylist;
import java.util.ArrayList;


public class maxwater {

    public static int mostwater(ArrayList<Integer> height)
    {
        int max=0;
        for(int i=0;i<height.size();i++)
        {   for(int j=i+1;j<height.size();j++)
            {
                int h=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currwater=h*width;
                max=Math.max(currwater,max);
            }


        }
        return max;
    }

    public static int maximumwater(ArrayList<Integer> list)
    {
        int lp=0;
        int rp=list.size()-1;
        int max=0;
        while(lp<rp)
        {   //calculate water
            int h=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int water=width*h;
            max=Math.max(max,water);

            //ptr update
            if(list.get(lp)<list.get(rp))
            {
                lp++;

            }
            else{
                rp--;
            }


        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(mostwater(list));
        System.out.println(maximumwater(list));
    }
}
