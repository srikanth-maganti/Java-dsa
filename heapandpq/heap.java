package heapandpq;
import java.util.*;

public class heap {
    public static class Heap
    {
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data)
        {
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(par)>arr.get(x))//O(logn)
            {
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
                }

        }
        public int peek()
        {   if(arr.isEmpty())
            {
                return -1;
            }
            return arr.get(0);
        }
        public void heapify(int i)
        {
            int left=i*2+1;
            int right=i*2+2;
            int minidx=i;

            if(left<arr.size()&& arr.get(minidx)>arr.get(left))
            {
                minidx=left;
            }
            if(right<arr.size()&& arr.get(minidx)>arr.get(right))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);

            }
        }
        public int remove()
        {   int data=arr.get(0);
            //swap first and last element
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        public boolean isEmpty()
        {
            return arr.isEmpty();
        }
        
    }
    public static void main(String args[])
        {
            Heap pq=new Heap();
            pq.add(3);
            pq.add(4);
            pq.add(1);
            pq.add(2);

            while(!pq.isEmpty())
            {
                System.out.println(pq.peek());
                pq.remove();
            }
        }
}
