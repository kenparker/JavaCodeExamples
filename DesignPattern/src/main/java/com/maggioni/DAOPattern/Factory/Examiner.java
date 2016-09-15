package com.maggioni.DAOPattern.Factory;

import java.util.Objects;

public class Examiner {

    private String examinerID;
    private String examinerName;

    public Examiner(String examinerID, String examinerName) {
        this.examinerID = examinerID;
        this.examinerName = examinerName;
    }

    public String getExaminerID() {
        return examinerID;
    }

    public void setExaminerID(String examinerID) {
        this.examinerID = examinerID;
    }

    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.examinerID);
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
        final Examiner other = (Examiner) obj;
        if (!Objects.equals(this.examinerID, other.examinerID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Examiner{" + "examinerID=" + examinerID + ", examinerName=" + examinerName + '}';
    }
    
}
