/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author taesankim
 */
public class UserList {
    private ArrayList<User> userList = new ArrayList<>();
    private String userFileName = "users.ser";
    
    public UserList(){
        this.readUserListFile();
        if(userList.isEmpty() || userList == null){
            createList();
            writeUserListFile();
            readUserListFile();
        }
        printUserList();
    }
    
    public void createList(){
        User u1 = new User("txk5231", "12345", "Taesan", "Kim", 
                "650-123-1234", "txk5231@psu.edu");
        userList.add(u1);
      
    }
    
    public void readUserListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(userFileName);
            in = new ObjectInputStream(fis);
            userList = (ArrayList)in.readObject();
            in.close();
            if(!userList.isEmpty())
                System.out.println("There were users in the file");
        } 
        catch (FileNotFoundException ex){
            System.out.println("File was not found, new one was created");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public void writeUserListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(userFileName);
            out =  new ObjectOutputStream(fos);
            out.writeObject(userList);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printUserList(){
        for (User user : userList) {
            System.out.println(user.toString());
        }    
    }

    public ArrayList<User> getUserList(){
        return userList;
    }
}