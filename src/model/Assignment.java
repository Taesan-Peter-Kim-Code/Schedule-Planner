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
public class Assignment extends Event implements Printable, Serializable{
    private String course = "";
    String assignmentInfo;

    public Assignment(String course, String serialNumber, String title, String startDate, String endDate, String description, String categories) {
        super(serialNumber, title, startDate, endDate, description, categories);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    } 
    
    @Override
    public void printSetup() {
        assignmentInfo = "Course:" + course +
                "\nSerial Number: " + super.getSerialNumber() +
                "\nTitle: " + super.getTitle() +
                "\nStart Date: " + super.getStartDate() +
                "\nEnd Date: " + super.getEndDate() +
                "\nDescription: " + super.getDescription() +
                "\ncategories: " + super.getCategories() ;
    }

    @Override
    public void print() {
        System.out.println(assignmentInfo);
    }
}
