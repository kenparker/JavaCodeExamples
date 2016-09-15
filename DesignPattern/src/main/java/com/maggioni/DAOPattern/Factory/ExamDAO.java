
package com.maggioni.DAOPattern.Factory;

import java.util.List;

public interface  ExamDAO {

    public boolean createExam(Exam e);
    public boolean updateExam(Exam e);
    public boolean deleteExam(Exam e);
    
    public List<Exam> getAllExams();
    public Exam getExam(String examID);
    
}
