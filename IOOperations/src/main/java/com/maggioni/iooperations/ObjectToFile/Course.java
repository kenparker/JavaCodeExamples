package com.maggioni.iooperations.ObjectToFile;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable {
        String name;
        List<Student> students;
 
        public void setName(String name) {
            this.name = name;
        }
 
        public void setStudents(List<Student> students) {
            this.students = students;
        }
 
        public String getName() {
            return name;
        }
 
        public List<Student> getStudents() {
            return students;
        }
}
