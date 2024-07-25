package queues;
import java.util.*;

public class s_q_by_deque {
    static class Stack{
        Deque<Integer> q=new LinkedList<>();

        //isempty
        public boolean isempty()
        {
            return q.isEmpty();
        }

        //push

        public void push(int data)
        {
            q.addLast(data);
        }

        //pop
        public int pop()
        {
            return q.removeLast();
        }

        //peek
        public int peek()
        {
        return q.getLast();
        }
    }

    static class Queue{
        Deque<Integer> q=new LinkedList<>();

        //isempty
        public boolean isempty()
        {
            return q.isEmpty();
        }

        //add
        public void add(int data)
        {
            q.addLast(data);
        }

        //remove
        public int remove()
        {
            return q.removeFirst();
        }

        //peek
        public int peek()
        {
            return q.getFirst();
        }
    }
    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty())
        {
            System.out.println(s.pop());
        }
        System.out.println();

        Queue q=new Queue();
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isempty())
        {
            System.out.println(q.remove());
        }

    }
}
