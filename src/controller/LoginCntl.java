/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.User;
import model.UserList;
import view.NewUserUI;
import view.UserUI;

/**
 *
 * @author taesankim
 */
public class LoginCntl implements ActionListener {

    private UserList userList;
    private ArrayList<User> listOfUsers;
    private UserUI userUI;
    private NewUserUI newUserUI;
    private User user;
    NavigationCntl navCntl;

    public LoginCntl() {
        userList = new UserList();
        listOfUsers = userList.getUserList();
        createUserUI();
        userUI.setVisible(true);
        createNewUserUI();
    }

    public void createUserUI() {
        userUI = new UserUI(this);
        userUI.cancelBtn.addActionListener(this);
        userUI.newUserBtn.addActionListener(this);
        userUI.submitBtn.addActionListener(this);
    }

    public void createNewUserUI() {
        newUserUI = new NewUserUI();
        newUserUI.cancelBtn.addActionListener(this);
        newUserUI.submitBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        boolean found = false;
        if (obj == userUI.submitBtn) {
            String userName = userUI.getUserNameTxt();
            String pw = userUI.getPwTxt();
            for (User user : listOfUsers) {
                if (user.getUserName().equals(userName)
                        && user.getPassword().equals(pw)) {
                    found = true;
                    userUI.setMessage("");
                    navCntl = new NavigationCntl();
                    userUI.dispose();
                }
            }
            if (!found) {
                userUI.setMessage("Invalid username and password");
            }
        }
        if (obj == userUI.newUserBtn) {
            newUserUI.setVisible(true);
            userUI.setVisible(false);
        }
        if (obj == newUserUI.submitBtn) {
            User newUser = newUserUI.getNewUser();
            listOfUsers.add(newUser);
            userList.writeUserListFile();
            newUserUI.setVisible(false);
            userUI.setVisible(true);

        }
    }
}
