package com.maggioni.mockito.FirstDemo;

import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExamManagerTestDemo1 {

    @Mock
    private List<Exam> listMock;

    @InjectMocks
    private ExamManager examManager;
    
    Exam e1 = new Exam("MA1001", "Algebra 1");
    Exam e2 = new Exam("MA5000", "Algebra 5000");
    
    @Test
    public void testCreateExamOk() {
        
        when(listMock.add(e1)).thenReturn(true);
        
        boolean addExam = examManager.addExam(e1);
        assertTrue(addExam);
    }
    
    @Test
    public void testCreateExamNichtOk() {
        when(listMock.add(e1)).thenReturn(true);
        
        boolean addExam = examManager.addExam(e2);
        assertFalse(addExam);
    }
    
}
