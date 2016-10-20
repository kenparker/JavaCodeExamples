
package com.maggioni.mockito.BBD;

import com.maggioni.mockito.Baeldung.Implementation.LoginController;
import com.maggioni.mockito.Baeldung.Implementation.LoginService;
import com.maggioni.mockito.Baeldung.Implementation.UserForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class BBDStyleDemo1 {

    @Mock
    LoginService loginServiceMock;
    
    @InjectMocks
    LoginController loginController;
    
    @Test
    public void assertTwoMethodsHaveBeenCalledBBDWay() {
        UserForm u1 = new UserForm();
        u1.username = "foo";
        
        // given
        BDDMockito.given(loginServiceMock.login(u1)).willReturn(Boolean.TRUE);
                
        // when
        loginController.login(u1);
        
        // then
        BDDMockito.then(loginServiceMock).should(Mockito.times(1)).login(u1);
                      
    }
}
