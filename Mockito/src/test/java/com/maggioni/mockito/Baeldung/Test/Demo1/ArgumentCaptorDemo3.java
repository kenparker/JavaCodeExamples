package com.maggioni.mockito.Baeldung.Test.Demo1;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorDemo3 {
    
    @Mock
    private LoginService loginService;
    
    @InjectMocks
    private LoginController loginController;
    
    @Captor
    ArgumentCaptor<UserForm> argCap;
    
    @Test
    public void checkArgCaptorDemo3() {
        
        UserForm uf = new UserForm();
        uf.username = "hhdhdhdhd";
        
        loginController.login(uf);
        
        Mockito.verify(loginService).login(uf);
        
        Mockito.verify(loginService).login(argCap.capture());
        final UserForm value = argCap.getValue();
        
        Assert.assertEquals("check  ", "hhdhdhdhd", value.getUsername());
        
    }
    
}
