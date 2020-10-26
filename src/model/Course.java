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
public class Course extends Event implements Printable, Serializable {
    private String instructor = "";
    private String assignment = "";
    String courseInfo;

    public Course(String instructor, String assignment, String serialNumber, String title, String startDate, String endDate, String description, String categories) {
        super(serialNumber, title, startDate, endDate, description, categories);
        this.instructor = instructor;
        this.assignment = assignment;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
    
    @Override
    public void printSetup() {
        courseInfo = "Instructor:" + instructor +
                "\nAssignment: " + assignment + 
                "\nSerial Number: " + super.getSerialNumber() +
                "\nTitle: " + super.getTitle() +
                "\nStart Date: " + super.getStartDate() +
                "\nEnd Date: " + super.getEndDate() +
                "\nDescription: " + super.getDescription() +
                "\ncategories: " + super.getCategories() ;
    }

    @Override
    public void print() {
        System.out.println(courseInfo);
    }
}
