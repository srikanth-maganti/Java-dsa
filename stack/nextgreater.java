package stack;
import java.util.*;

public class nextgreater {
    public static void findnextgreater( int arr[],int[] nextgreat)
    {   Stack<Integer> s=new Stack<>();
        

        for(int i=nextgreat.length-1;i>=0;i--)
        {   int curr=arr[i];
            while(!s.isEmpty() && arr[i]>=arr[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nextgreat[i]=-1;
            }
            else
            {
                nextgreat[i]=arr[s.peek()];
            }
            s.push(i);

        }

    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextgreat[]=new int[arr.length];
        findnextgreater(arr,nextgreat);

        for(int i=0;i<nextgreat.length;i++)
        {
            System.out.print(nextgreat[i]+" ");
        }
    }
}
