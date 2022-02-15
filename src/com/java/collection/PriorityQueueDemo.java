package com.java.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
class Student implements Comparable<Student>{

    private String name;
    private int rank;

    public Student(String name, int rank) {

        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student st) {//
        if(rank <st.rank)//3<2=f 3>2 =t return1 2 2<3
            return -1;//2<2                     3
        else if(rank >st.rank)//                1
            return 1;//                         5
        return 0;//                             4
    }
    @Override
    public String toString() {
        String result = "Student name: " + name +", " + "rank:" + rank;
        return result;
    }

}

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Student> studentQ = new PriorityQueue<>();
//PriorityQueue does not follow fifo rule
        studentQ.add(new Student("Soumya", 3) );
        studentQ.add(new Student("Soumya",2));
        studentQ.add(new Student("Sanju",1));
        studentQ.add(new Student("Sony",5));
        studentQ.add(new Student("Rahu",4));
        System.out.println("Size of queue: " +studentQ.size());
        Iterator<Student> iterator = studentQ.iterator();

        while (iterator.hasNext()) {
            System.out.println( "The item of the Queue: " + studentQ.poll().toString());
        }
            }
        }

