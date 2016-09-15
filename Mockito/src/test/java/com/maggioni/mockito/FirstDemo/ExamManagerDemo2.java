package com.maggioni.mockito.FirstDemo;

import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class ExamManagerDemo2 {

    Exam e1 = new Exam("MA1001", "Algebra 10000");
    Exam e2 = new Exam("MA6000", "Algebra 160001");
    
    @Test
    public void testCreateExamOK() {
    
        // setup mock object
        List<Exam> mock = Mockito.mock(List.class);
        ExamManager em = new ExamManager(mock);
        
        // adding behavior
        when(mock.add(e1)).thenReturn(true);
        
        boolean addExam = em.addExam(e1);
        assertTrue(addExam);
    }
    
    @Test
    public void testCreateExamWithoutBehavior() {
    
        // setup mock object
        List<Exam> mock = Mockito.mock(List.class);
        ExamManager em = new ExamManager(mock);
        
        // there is no behavior, so the result will be false
        boolean addExam = em.addExam(e1);
        assertFalse(addExam);
    }
}
