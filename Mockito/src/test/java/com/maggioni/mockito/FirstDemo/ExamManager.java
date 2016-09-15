package com.maggioni.mockito.FirstDemo;

import java.util.List;

public class ExamManager {

    private List<Exam> listOfExams;

    public ExamManager(List<Exam> listOfExams) {
        this.listOfExams = listOfExams;
    }

    public boolean addExam(Exam e) {
        boolean add = listOfExams.add(e);
        return add;
    }

}
