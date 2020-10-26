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
public class Event implements Serializable{
    private String serialNumber = "";
    private String title = "";
    private String startDate = "";
    private String endDate = "";
    private String description = "";
    private String categories = "";

    public Event(String serialNumber, String title, String startDate, String endDate, String description, String categories) {
        this.serialNumber = serialNumber;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.categories = categories;
    }
    
    public void createProject() {
        System.out.println("This is the createProject method in BasicInfo");
    }
    
    public String getProjectDetails() {
        System.out.println("This is the getProjectDetails method in BasicInfo");
        return "Project details go here";           
    }
    
    public void createCourse() {
        System.out.println("This is the createCourse method in BasicInfo");
    }
    
    public String getCourseDetails() {
        System.out.println("This is the getCourseDetails method in BasicInfo");
        return "Course details go here";           
    }
    
    public void createAssignment() {
        System.out.println("This is the createAssignment method in BasicInfo");
    }
    
    public String getAssignmentDetails() {
        System.out.println("This is the getAssignmentDetails method in BasicInfo");
        return "Assignment details go here";           
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals(""))
            System.out.println("Title is invalid");
        else
            this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
    
    @Override
    public String toString() {
        return "Basic Information(" + "Serial Number: " + serialNumber +
                "\nTitle: " + title +
                "\nStart Date: " + startDate +
                "\nEnd Date: " + endDate +
                "\nDescription: " + description +
                "\ncategories: " + categories + ")";
    }
}
