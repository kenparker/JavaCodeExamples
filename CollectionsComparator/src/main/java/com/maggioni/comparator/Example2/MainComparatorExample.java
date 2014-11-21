package com.maggioni.comparator.Example2;

import java.util.Arrays;

public class MainComparatorExample {

    public static void main(String[] args) {

        Student student[] = new Student[3];

        student[0] = new Student();
        student[0].setName("Nick");
        student[0].setGrade(19);

        student[1] = new Student();
        student[1].setName("Helen");
        student[1].setGrade(12);

        student[2] = new Student();
        student[2].setName("Ross");
        student[2].setGrade(16);

        System.out.println("Order of Students before sorting is:");
        printArray(student);
        
        Arrays.sort(student, new GradeComparator());
        System.out.println("Order of Students after sorting by Grade is:");
        printArray(student);
        
        Arrays.sort(student, new GradeComparator().reversed());
        System.out.println("Order of Students after sorting by Grade (Reverse Order) is:");
        printArray(student);
        
        Arrays.sort(student, new NameComparator());
        System.out.println("Order of Students after sorting by Name is:");
        printArray(student);
    }

    private static void printArray(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
    }

}
