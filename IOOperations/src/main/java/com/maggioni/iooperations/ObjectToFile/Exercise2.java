package com.maggioni.iooperations.ObjectToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magang
 */
public class Exercise2 {

    public static void main(String[] args) {
        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                        new FileOutputStream("javaObjects.txt"));) {
// write a date
                    objectOutputStream.writeObject(new Date());
// write a boolean
                    objectOutputStream.writeBoolean(true);
// write a float
                    objectOutputStream.writeFloat(1.0f);

// the other primitive types and objects can be saved as well
// create two students objects and add them in a list. create a course
// object and add the list of students to a list
                    Student student1 = new Student("Student v1", "Stud n", 30);
                    Student student2 = new Student("Student v2", "Stud n2", 15);

                    Course course = new Course();
                    course.setName("Java IO");
                    List<Student> students = new ArrayList<>();
                    students.add(student1);
                    students.add(student2);
                    course.setStudents(students);

// write the course object to the objectoutputstream. This writes the
// object as well all objects that it referes to.
// it writes only those objects that implement serializable
                    objectOutputStream.writeObject(course);
                    objectOutputStream.flush();
                    objectOutputStream.close();
                } catch (IOException ex) {

                }
// the object input stream reads the objects back from the file and
// creates java objects out of them. It recreates all
// references that were present when the objects were written
                try (ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("javaObjects.txt"));) {

// start getting the objects out in the order in which they were written
                    Date date = (Date) objectInputStream.readObject();
                    System.out.println(date);
                    System.out.println(objectInputStream.readBoolean());
                    System.out.println(objectInputStream.readFloat());

// get the course object
                    Course readCourse = (Course) objectInputStream.readObject();
                    System.out.println(readCourse.getName());
                    Student student1Read = readCourse.getStudents().get(0);
                    System.out.println(student1Read.getAge());
                    System.out.println(student1Read.getFirstName());
                    objectInputStream.close();
                } catch (ClassNotFoundException ex) {

                } catch (IOException ex) {

                }
    }

}
