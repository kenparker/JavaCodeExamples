package com.maggioni.mockito.Baeldung.Test.Demo1;

/*
 example based on : http://www.baeldung.com/mockito-vs-easymock-vs-jmockit
 */
import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentMatchingDemo1 {

    
    @Mock
    private LoginService loginServiceMock;

    @InjectMocks
    private LoginController loginController;

    @Test
    public void assertArgumentMatchAnyDemo1() {
        
        UserForm u1 = new UserForm();
        
        when(loginServiceMock.login(Mockito.any(UserForm.class))).thenReturn(true);
        
        String login = loginController.login(u1);
        
        Assert.assertEquals("OK", login);
        
        verify(loginServiceMock).login(Mockito.any(UserForm.class));
        verify(loginServiceMock).login(u1);
    }
    
    @Test
    public void assertArgumentMatchAnyDemo2() {
        
        UserForm u1 = new UserForm();
        UserForm u2 = new UserForm();
        
        when(loginServiceMock.login(Mockito.any(UserForm.class))).thenReturn(true);
        
        String login = loginController.login(u2);
        
        Assert.assertEquals("OK", login);
        
        verify(loginServiceMock).login(Mockito.any(UserForm.class));
        //verify(loginServiceMock).login(u1);
    }
    
    @Test
    public void assertArgumentMatchAnyAndArgThatDemo1() {
        UserForm u1 = new UserForm();
        u1.username = "carlo";
        UserForm u2 = new UserForm();
        u2.username = "Anxgelo";
        
        when(loginServiceMock.login(Mockito.any(UserForm.class))).thenReturn(true);
        
        String login = loginController.login(u2);
        
        Assert.assertEquals("OK", login);
        
        verify(loginServiceMock).login(Matchers.argThat(new UserFormMatcher()));
    }
    
    @Test
    public void assertArgumentMatchAnyandArgThatVerifyNever() {
        UserForm u1 = new UserForm();
        u1.username = "carlo";
        UserForm u2 = new UserForm();
        u2.username = "Anxgelo";
        
        when(loginServiceMock.login(Mockito.any(UserForm.class))).thenReturn(true);
        
        String login = loginController.login(u1);
        
        Assert.assertEquals("OK", login);
        
        verify(loginServiceMock, Mockito.never()).login(Matchers.argThat(new UserFormMatcher()));
    }

}

class UserFormMatcher extends ArgumentMatcher<UserForm> {

    @Override
    public boolean matches(Object argument) {
        if (argument instanceof UserForm) {
            return ((UserForm) argument).username.startsWith("An");
        } else return false;
    }
    
}
