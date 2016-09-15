package com.maggioni.DAOPattern.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CloudscapeExamDAO implements ExamDAO{
    private List<Exam> listOfExams = Collections.emptyList();

    public CloudscapeExamDAO() {
        this(new ArrayList<Exam>());
    }

    public CloudscapeExamDAO(List<Exam> listOfExams) {
        this.listOfExams = listOfExams;
    } 
    
    @Override
    public boolean createExam(Exam e) {
        return listOfExams.add(e);
    }

    @Override
    public boolean updateExam(Exam e) {
        int indexOf = listOfExams.indexOf(e);
        if (indexOf > 0) {
            listOfExams.set(indexOf, e);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteExam(Exam e) {
        return listOfExams.remove(e);
    }

    @Override
    public List<Exam> getAllExams() {
        return listOfExams;
    }

    @Override
    public Exam getExam(String examID) {
        for (Exam exam : listOfExams) {
            if (exam.getExamID().equals(examID)) {
                return exam;
            }
        }
        return null;
    }

    
    
    
}
