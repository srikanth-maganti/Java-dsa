package greedy;
import java.util.*;

public class activitysel {
    // public static void main(String[] args) {
    //     int start[]={1,3,0,5,8,5};
    //     int end[]={2,4,6,7,9,9};

    //     ArrayList<Integer> arr=new ArrayList<>();
    //     int maxcount=0;

    //     //1st activity

    //     maxcount=1;
    //     arr.add(0);
    //     int lastend=end[0];
    //     for(int i=1;i<start.length;i++)
    //     {
    //         if(start[i]>=lastend)
    //         {
    //             arr.add(i);
    //             lastend=end[i];
    //             maxcount++;
    //         }
    //     }
    //     System.out.println(maxcount);

    //     for(int i=0;i<arr.size();i++)
    //     {
    //         System.out.print(arr.get(i)+" ");
    //     }

        

    // }


    //if end is not sorted
    public static void main(String[] args) {
        int start[]={1,0,8,3,5,5};
        int end[]={
        2,6,9,4,7,9
        };

        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> arr=new ArrayList<>();
        //first activity
        int maxcount=1;
        arr.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int i=1;i<start.length;i++)
        {
            if(activities[i][1]>=lastend)
            {   //select activity
                lastend=activities[i][2];
                arr.add(activities[i][0]);
                maxcount++;
            }
        }
        System.out.println(maxcount);

            for(int i=0;i<arr.size();i++)
            {
                System.out.print(arr.get(i)+" ");
            }

    }
}
