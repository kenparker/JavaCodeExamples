package com.maggioni.mockito.Baeldung.Test.Demo1;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorDemo2 {
    
    @Mock
    LoginController loginController;
    
    @Captor
    ArgumentCaptor<UserForm> argumentCaptor;
    
    @Test
    public void CaptorMockDemo2() {
        
        UserForm uf = new UserForm();
        uf.username =  "Hello";
        
        loginController.login(uf);
    
        Mockito.verify(loginController).login(argumentCaptor.capture());
        Assert.assertEquals("UserName Test :", "Hello", argumentCaptor.getValue().getUsername());
        
        
    }
    
}
