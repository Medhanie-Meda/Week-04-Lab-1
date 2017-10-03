package service;

public class UserService 
{    
    public User login(String username, String password)
    {
        User u = null;
        if(username.equalsIgnoreCase("adam") && password.equals("password") 
                || username.equalsIgnoreCase("betty") && password.equals("password"))
        {
             u = new User(username, null);
        }       
        return u;              
    }    
}
