import java.util.*;

public class stockspan
{   public static void stockspans(int stocks[],int span[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        span[0]=1;

        for(int i=1;i<stocks.length;i++)
        {
            int curr=stocks[i];
            while(!s.isEmpty() && curr>stocks[s.peek()] )
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String args[])
    {
        int stocks[]={100,80,60,70,60,85,100};

        int span[]=new int[stocks.length];

        stockspans(stocks,span);

        for(int i=0;i<span.length;i++)
        {
            System.out.print(span[i]+" ");
        }

    }
}