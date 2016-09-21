package com.maggioni.mockito.Baeldung.Implementation;

public class LoginService {
    private LoginDAO loginDAO;
    private String currentUser;
    
    public boolean login(UserForm userForm) {
        assert null != userForm;
        
        int loginResults = loginDAO.login(userForm);
        switch(loginResults){
            case 1:
                return true;
            default:
                return false;
        }
    }
    
    public void setCurrentUser(String username) {
        if (null != username) {
            this.currentUser = username;
        }
    }
}
