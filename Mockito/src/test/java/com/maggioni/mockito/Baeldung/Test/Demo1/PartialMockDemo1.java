package com.maggioni.mockito.Baeldung.Test.Demo1;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginDAO;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PartialMockDemo1 {
    
    @Mock
    private LoginDAO loginDao;
    
    @Spy
    @InjectMocks
    private LoginService loginServiceMock;
    
    private LoginController loginController;
    
    @Test
    public void partialTestDemo1() {
        
        loginController = new LoginController();
        loginController.loginService = loginServiceMock;
        
        UserForm u1 = new UserForm();
        u1.username = "angelo";
        
        loginController.login(u1);
        
        Mockito.verify(loginServiceMock).login(u1);
        Mockito.verify(loginDao).login(u1);
        Mockito.verify(loginDao,Mockito.atLeastOnce()).login(u1);
    }
    
    @Test
    public void partialTestStubbingDeepDemo1() {
        
        loginController = new LoginController();
        loginController.loginService = loginServiceMock;
        
        UserForm u1 = new UserForm();
        u1.username = "angelo";
        
        Mockito.when(loginDao.login(u1)).thenReturn(1);
        
        loginController.login(u1);
        
        Mockito.verify(loginServiceMock).login(u1);
        Mockito.verify(loginDao).login(u1);
        Mockito.verify(loginDao,Mockito.atLeastOnce()).login(u1);
    }
}
