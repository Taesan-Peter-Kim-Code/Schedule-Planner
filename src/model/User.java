package model;

import java.io.Serializable;

/**
 *
 * @author taesankim
 */
public class User extends Person implements Serializable{
    private String userName, password;

    public User(String userName, String password, String firstName, String lastName, String phone, String email) {
        super(firstName, lastName, phone, email);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return "userName: "+userName;
    }
    
    
}
