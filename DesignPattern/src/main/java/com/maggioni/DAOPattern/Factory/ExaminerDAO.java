package com.maggioni.DAOPattern.Factory;

import java.util.List;

public interface ExaminerDAO {
    public boolean createExaminer(Examiner ex);
    public boolean updateExaminer(Examiner ex);
    public boolean deleteExaminer(Examiner ex);
    
    public List<Examiner> getAllExaminers();
    public Examiner getExaminer(String examinerID);
}
