package com.maggioni.DAOPattern.Factory;

class CloudscapeDAOFactory extends DAOFactory{

    @Override
    public ExamDAO getExamDAO() {
        return new CloudscapeExamDAO();
    }

    @Override
    public ExaminerDAO getExaminerDAO() {
        return new CloudscapeExaminerDAO();
    }
    
}
