package com.maggioni.mockito.FirstDemo.SecondDemo;

import com.maggioni.DAOPattern.Factory.Examiner;
import java.util.List;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ClientDemo1Test1 {
    
    @Mock
    List<Examiner> listOfExaminers;
    
    @InjectMocks
    CloudscapeExaminerDAO examinerDAO;
    
}
