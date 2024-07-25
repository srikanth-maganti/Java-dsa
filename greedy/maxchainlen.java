package greedy;

import java.util.*;
public class maxchainlen
{
    public static void main(String args[])
    {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        //1st
        int count=1;
        int last=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0]>last)
            {
                last=pairs[i][1];
                count++;
            }
        }
        System.out.println(count);
    }

}