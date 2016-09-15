package com.maggioni.DAOPattern.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CloudscapeExaminerDAO implements ExaminerDAO {

    private List<Examiner> listOfExaminers = Collections.emptyList();
    public CloudscapeExaminerDAO() {
        this(new ArrayList<Examiner>());
    }
    public CloudscapeExaminerDAO(List<Examiner> listOfExaminers) {
        this.listOfExaminers = listOfExaminers;
    }

    @Override
    public boolean createExaminer(Examiner ex) {
        return listOfExaminers.add(ex);
    }

    @Override
    public boolean updateExaminer(Examiner ex) {
        int indexOf = listOfExaminers.indexOf(ex);
        if (indexOf > 0) {
            listOfExaminers.set(indexOf, ex);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteExaminer(Examiner ex) {
        return listOfExaminers.remove(ex);
    }

    @Override
    public List<Examiner> getAllExaminers() {
        return listOfExaminers;
    }

    @Override
    public Examiner getExaminer(String examinerID) {
        for (Examiner examiner : listOfExaminers) {
            if (examiner.getExaminerID().equals(examinerID)) {
                return examiner;
            }
        }
        return null;
    }
    
}
