package queues;

public class queuearr {
     public static class Queue{
        int arr[];
        int size;
        int rear;
        public Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public boolean isempty()
        {
            return rear==-1;
        }

        public void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("queue filled");
                return;
            }
            rear=rear+1;
            arr[rear]=data;

        }

        public int remove()
        {
            if(isempty())
            {   System.out.println("queue is empty");
                return -1; 
            }
            int front=arr[0];

            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            
            return front;
        }

        public int peek()
        {
            if(isempty())
            {
                return -1;

            }
            return arr[0];
        }
     }
    public static void main(String[] args) {
            Queue q=new Queue(5);
            q.add(3);
            q.add(2);
            q.add(1);
            q.remove();
            System.out.println(q.peek());
            while(!q.isempty())
            {
                System.out.println(q.peek());
                q.remove();
            }
    }
}
