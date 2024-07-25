package stack;

import java.util.Stack;



public class maxhistarea {
    public static int maxarea(int heights[])
    {   Stack<Integer> s=new Stack<>();
        int nsl[]=new int[heights.length];
        int nsr[]=new int[heights.length];

        //calculating nsl
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[i]<=heights[s.peek()] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        //calculating nsr
        for(int i=heights.length-1;i>=0;i--)
        {
                while(!s.isEmpty() && heights[i]<=heights[s.peek()])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    nsr[i]=heights.length;
                }
                else{
                    nsr[i]=s.peek();
                }
                s.push(i);
        }
       

        int maxarea=0;
        for(int i=0;i<heights.length;i++)
        {
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int curr=height*width;
            maxarea=Math.max(maxarea,curr);

        }
        return maxarea;
    }
    public static void main(String args[])
    {
        int heights[]={2,1,5,6,2,3};
        System.out.println(maxarea(heights));
    }
}
