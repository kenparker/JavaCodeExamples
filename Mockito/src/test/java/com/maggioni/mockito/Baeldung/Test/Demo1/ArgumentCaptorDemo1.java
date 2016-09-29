package com.maggioni.mockito.Baeldung.Test.Demo1;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/*
http://www.planetgeek.ch/2011/11/25/mockito-argumentmatcher-vs-argumentcaptor/
http://www.baeldung.com/mockito-annotations
*/
@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorDemo1 {
        
    @Mock
    LoginController loginController;
    
        
    @Test
    public void CaptorMockDemo1() {
        UserForm uf = new UserForm();
        uf.username = "hello";
        loginController.login(uf);
    
        ArgumentCaptor<UserForm> argumentCaptor = ArgumentCaptor.forClass(UserForm.class);
        Mockito.verify(loginController).login(argumentCaptor.capture());
        Assert.assertEquals("Username test", "hello", argumentCaptor.getValue().getUsername());
    }
}
