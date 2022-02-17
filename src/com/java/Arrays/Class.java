package com.java.Arrays;
class Student{//we can only give one data type in arrays
    int studentRollNo;
    String studentName;
    int studentTotalMarks;

    public Student(int studentRollNo, String studentName, int studentTotalMarks) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentTotalMarks = studentTotalMarks;
    }
}

public class Class {


    public static void main(String args[]) {
        Student[] array = new Student[5];

        array[0] = new Student(1,"Soumya",678);
        array[1] = new Student(2,"Rahul",780);
        array[2] = new Student(3,"Sanju",922);
        array[3] = new Student(4,"Punith",882);
        array[4] = new Student(5,"Veda",546);
       for(int i=0;i<array.length;i++){
           System.out.println("Student Details: " + " "+ "ID:" +
                   array[i].studentRollNo +" "+"NAME:" + " "+ array[i].studentName + " " +"TOTAL MARKS:" +" "+array[i].studentTotalMarks);
       }


    }
}
