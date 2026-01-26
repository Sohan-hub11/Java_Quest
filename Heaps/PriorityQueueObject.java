//Priority Queue Object.

package Heaps;

import java.util.*;

public class PriorityQueueObject {
    static class Student implements Comparable<Student> { //Overriding
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        //For reversing the order
        //PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 15));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 11));
        pq.add(new Student("E", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}
