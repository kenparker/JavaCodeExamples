package com.maggioni.mockito.Baeldung.Test.Demo1;

/*
 example based on : http://www.baeldung.com/mockito-vs-easymock-vs-jmockit
 */
import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginDAO;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTestDemo1 {

    @Mock
    private LoginDAO loginDAOMock;

    @Spy
    @InjectMocks
    private LoginService spiedLoginService;

    @Mock
    private LoginService loginServiceMock;

    @InjectMocks
    private LoginController loginController;

    private UserForm userForm1 = new UserForm();
    private UserForm userForm2 = new UserForm();
    private UserForm userForm3 = new UserForm();
    @Mock
    private UserForm userForm4;
    
    @Before
    public void setup() {
        
        /* the two following statement are not needed with @RunWith
        loginController = new LoginController();
        MockitoAnnotations.initMocks(this);
        */
        
        
    }

    @Test
    public void assertThatNoMethodHasBeenCalled1() {
        loginController.login(null);
        verifyZeroInteractions(loginServiceMock);
    }

    @Test
    public void assertThatNoMethodHasBeenCalled2() {
        loginController.login(null);
        verifyZeroInteractions(loginDAOMock);
    }

    @Test
    public void assertTwoMethodsHaveBeenCalled1() {
        userForm1.username = "foo";
        when(loginServiceMock.login(userForm1)).thenReturn(true);

        loginController.login(userForm1);

        verify(loginServiceMock).login(userForm1);
        verify(loginServiceMock).setCurrentUser("foo");

    }

    @Test
    public void assertReturnValueIsOKDemo1() {
        
        userForm1.username = "foo";
        when(loginServiceMock.login(userForm1)).thenReturn(true);
        String login = loginController.login(userForm1);
        
        verify(loginServiceMock).setCurrentUser("foo");
        verify(loginServiceMock).login(userForm1);
        Assert.assertEquals("OK", login);
    }
    
    /*
    the UserForm Object here is a mock and not a real object
    */
    @Test
    public void assertReturnValueIsOKDemo2() {
        
        /*
        according to the docu we should not create a OngoingStubbing object
        */
        OngoingStubbing<String> thenReturn = when(userForm4.getUsername()).thenReturn("foo");
        /*
        create a UserForm mock object to pass around
        
        the object created with getMock() is actually the same as userForm4, so in this case it does not make much sense
        to create another moch with getMock()
        */
        UserForm mock = thenReturn.getMock();
        
        //boolean equals = mock.equals(userForm4);
        assertEquals(userForm4, mock);
        
        when(loginServiceMock.login(mock)).thenReturn(true);
        
        String login = loginController.login(mock);
        
        verify(loginServiceMock).setCurrentUser("foo");
        verify(loginServiceMock).login(mock);
        Assert.assertEquals("OK", login);
    }
    
    /*
    is similar to the previous example
    */
    @Test
    public void assertReturnValueIsOKDemo3() {
        
        /*
        the UserForm moch is created hier on the fly
        */
        UserForm mock = when(mock(UserForm.class).getUsername()).thenReturn("foo").getMock();
        
        when(loginServiceMock.login(mock)).thenReturn(true);
        
        String login = loginController.login(mock);
        
        verify(loginServiceMock).setCurrentUser("foo");
        verify(loginServiceMock).login(mock);
        verify(mock).getUsername();
        Assert.assertEquals("OK", login);
    }
    
    /*
    the Demo1 user verify with never() as parameter
    */
    @Test
    public void assertReturnValueIsNotOKDemo1() {
        userForm2.username = "boo";
        when(loginServiceMock.login(userForm2)).thenReturn(false);
        
        String login = loginController.login(userForm2);
        
        verify(loginServiceMock,Mockito.never()).setCurrentUser("boo");
        verify(loginServiceMock).login(userForm2);
        Assert.assertEquals("NO", login);
    }
    
    /*
    the Demo2 test use verifyNoMoreInteractions
    */
    @Test
    public void assertReturnValueIsNotOKDemo2() {
        
        String login = loginController.login(userForm2);
        
        verify(loginServiceMock).login(userForm2);      
        verifyNoMoreInteractions(loginServiceMock);
        assertEquals("NO", login);
    }
    
    @Test
    public void assertExceptionThrowing() {
        when(loginServiceMock.login(userForm3)).thenThrow(Exception.class);
        
        String login = loginController.login(userForm3);
        
        verify(loginServiceMock).login(userForm3);
        verifyNoMoreInteractions(loginServiceMock);
        assertEquals("ERROR", login);
        
    }
}
