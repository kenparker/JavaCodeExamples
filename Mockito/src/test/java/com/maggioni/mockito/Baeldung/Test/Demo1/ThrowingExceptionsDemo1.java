package com.maggioni.mockito.Baeldung.Test.Demo1;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginDAO;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ThrowingExceptionsDemo1 {
    
    @Mock
    private LoginService loginServiceMock;

    @InjectMocks
    private LoginController loginController;
    
    @Test (expected = Exception.class)
    public void ExceptionTest1() throws Exception {   
        UserForm uf = new UserForm();
        
        loginController.validateUserForm(uf);
        
        
    }
    
    @Test
    public void assertExceptionThrowing() {
        UserForm userForm3 = new UserForm();
        when(loginServiceMock.login(userForm3)).thenThrow(Exception.class);
        
        String login = loginController.login(userForm3);
        
        verify(loginServiceMock).login(userForm3);
        verifyNoMoreInteractions(loginServiceMock);
        assertEquals("ERROR", login);
        
    }
    
    @Test (expected = Exception.class)
    public void mockingVoidMethodTest1() throws Exception {
        UserForm uf = new UserForm();
        
        Mockito.doThrow(new Exception()).when(loginServiceMock).validate(uf);
        
        loginController.voidMethodToTest(uf);
    }
}
