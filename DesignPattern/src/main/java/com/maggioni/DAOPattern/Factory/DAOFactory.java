package com.maggioni.DAOPattern.Factory;

public abstract class DAOFactory {

    public enum DataBase {
        CLOUDSCAPE, ORACLE, SYBASE
    }

    public abstract ExamDAO getExamDAO();
    public abstract ExaminerDAO getExaminerDAO();

    public static DAOFactory getDAOFactory(DataBase db) {

        switch (db) {
            case CLOUDSCAPE:
                return new CloudscapeDAOFactory();
            default:
                return null;
        }
    }
}
