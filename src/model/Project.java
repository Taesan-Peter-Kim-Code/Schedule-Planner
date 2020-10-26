/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author taesankim
 */
public class Project extends Event implements Printable, Serializable {
    private Integer priority;
    private String todolist;
    String projectInfo;

    public Project(Integer priority, String todolist, String serialNumber, String title, String startDate, String endDate, String description, String categories) {
        super(serialNumber, title, startDate, endDate, description, categories);
        this.priority = priority;
        this.todolist = todolist;
    }


    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }
    
    @Override
    public void printSetup() {
        projectInfo = "Priority:" + priority +
                "\nToDo List: " + todolist + 
                "\nSerial Number: " + super.getSerialNumber() +
                "\nTitle: " + super.getTitle() +
                "\nStart Date: " + super.getStartDate() +
                "\nEnd Date: " + super.getEndDate() +
                "\nDescription: " + super.getDescription() +
                "\ncategories: " + super.getCategories() ;
    }

    @Override
    public void print() {
        System.out.println(projectInfo);
    }
}
