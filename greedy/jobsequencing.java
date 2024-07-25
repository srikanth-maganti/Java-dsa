package greedy;
import java.util.*;

public class jobsequencing {
    static class Job{
        int profit;
        int deadline;
        int id;//0,1,2...
        public Job(int id,int deadline,int profit )
        {
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }

    }
    public static void main(String[] args) {
        int jobinfo[][]={ {4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0;i<jobinfo.length;i++)
        {
            jobs.add(new Job(i,jobinfo[i][0],jobinfo[i][1]));
        }


        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        int time=0;

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<jobs.size();i++)
        {
            Job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                arr.add(curr.id);
                
                time++;
            }
        }

        System.out.println(arr.size()+" is no of jobs");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }


    }
}
