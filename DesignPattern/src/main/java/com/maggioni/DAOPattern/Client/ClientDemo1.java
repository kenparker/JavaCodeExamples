package com.maggioni.DAOPattern.Client;

import com.maggioni.DAOPattern.Factory.DAOFactory;
import com.maggioni.DAOPattern.Factory.Exam;
import com.maggioni.DAOPattern.Factory.ExamDAO;
import com.maggioni.DAOPattern.Factory.ExaminerDAO;
import java.util.List;

/*
http://www.oracle.com/technetwork/java/dataaccessobject-138824.html
*/
public class ClientDemo1 {

    public static void main(String[] args) {
        
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.DataBase.CLOUDSCAPE);
        ExamDAO examDAO = daoFactory.getExamDAO();
        ExaminerDAO examinerDAO = daoFactory.getExaminerDAO();
        
        List<Exam> allExams = examDAO.getAllExams();
        examinerDAO.getAllExaminers();
        
        boolean createExam = examDAO.createExam(new Exam("AAA", "BBBB"));
    }
}
