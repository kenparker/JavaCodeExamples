package com.maggioni.mockito.Baeldung.Implementation;

/**
 *
 * @author Baeldung
 * 
 * http://www.baeldung.com/mockito-vs-easymock-vs-jmockit
 * 
 */
public class LoginController {
    public LoginService loginService;
    
    public String login(UserForm userForm) {
        if (null == userForm) {
            return "ERROR";
        } else {
            boolean logged;
            
            try {
                logged = loginService.login(userForm);
            } catch (Exception e) {
                return "ERROR";
            }
            
            if (logged) {
                loginService.setCurrentUser(userForm.getUsername());
                return "OK";
            } else {
                return "NO";
            }
        }
    }
    
    public String validateUserForm(UserForm uf) throws Exception {
        if (uf.username.equals(null)) {
            throw new Exception("Username is empty");
        }
        return "OK";
    }
    
    public void voidMethodToTest(UserForm uf) throws Exception{
        loginService.validate(uf);
    }
}
