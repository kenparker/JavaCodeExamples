package com.maggioni.DAOPattern.Factory;

import java.util.Objects;

public class Exam {

    private String examID;
    private String examName;

    public Exam(String examCode, String examName) {
        this.examID = examCode;
        this.examName = examName;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examCode) {
        this.examID = examCode;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.examID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (!Objects.equals(this.examID, other.examID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exam{" + "examCode=" + examID + ", examName=" + examName + '}';
    }
    
}
