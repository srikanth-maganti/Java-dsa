package heapandpq;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.*;
public class priorityqueue {

        //comarable class 
        public static class Student implements Comparable<Student>//Comparable interface gives power to compare objects of this class
        {
            String name;
            int rank;
            Student(String name,int rank)
            {
                this.name=name;
                this.rank=rank;
            }

            @Override
            public int compareTo(Student s2)
            {
                return this.rank-s2.rank;
            }
        }


        public static void main(String args[])
        {
            PriorityQueue<Integer> pq1=new PriorityQueue<>();
            pq1.add(1);
            pq1.add(5);
            pq1.add(3);

            while(!pq1.isEmpty())
            {
                System.out.println(pq1.peek());
                pq1.remove();
            }


            //priority queue of objects
            // PriorityQueue<Student> pq2=new PriorityQueue<>();
            PriorityQueue<Student> pq2=new PriorityQueue<>(Comparator.reverseOrder());
            pq2.add(new Student("A",23));
            pq2.add(new Student("B",2));
            pq2.add(new Student("C",8));
            while(!pq2.isEmpty())
            {
                System.out.println(pq2.peek().name +"->"+pq2.peek().rank);
                pq2.remove();
            }
        }
}
