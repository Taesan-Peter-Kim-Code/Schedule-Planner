/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.util.ArrayList;
import model.Assignment;
import model.Event;
import model.Course;
import model.Printable;
import model.Project;
import model.User;
/**
 *
 * @author taesankim
 */
public class TestHarness {
    public TestHarness() {
        //testBasicInfo();
        //testAssignment();
        //testCourse();
        //testProject();
        testClassHierarchy();
        testInterface();
    }
    public void testEvent() {
        //Test the Event class
        Event b1 = new Event("serialNumber", "title", "01/23/2020", "02/22/2020", "description", "categories");
        if (b1 != null) {
            System.out.println("Test basicInfo created successfully");
            System.out.println(b1.toString());
            b1.setCategories("assignment");
            System.out.println(b1.toString());
        } else {
            System.out.print("BasicInfo is null");
        }
    }
    public void testAssignment() {
        //Test the Assignment class
        Assignment a1 = new Assignment("course", "serialNumber", "title", "01/23/2020", "02/22/2020", "description", "categories");
        if (a1 != null) {
            System.out.println("Test assignment created successfully");
            System.out.println(a1.toString());
            a1.setCourse("");
            System.out.println(a1.toString());
            a1.setCourse("IST 261");
            System.out.println(a1.toString());
            a1.setSerialNumber("AA12");
            System.out.println(a1.toString());
        } else {
            System.out.println("Assignment is null");
        }
    }
    public void testCourse() {
        //Test the Course class
        Course c1 = new Course("instructor", "assignment", "serialNumber", "title", "01/23/2020", "02/22/2020", "description", "categories");
        if (c1 != null) {
            System.out.println("Test course created successfully");
            System.out.println(c1.toString());
            c1.setInstructor("");
            System.out.println(c1.toString());
            c1.setInstructor("Peggy Fisher");
            System.out.println(c1.toString());
            c1.setSerialNumber("AC13");
            System.out.println(c1.toString());
        } else {
            System.out.println("Course is null");
        }
    }
    public void testProject() {
        //Test the Project class
        Project p1 = new Project(10, "todolist", "serialNumber", "title", "01/23/2020", "02/22/2020", "description", "categories");
        if (p1 != null) {
            System.out.println("Test project created successfully");
            System.out.println(p1.toString());
            p1.setPriority(null);
            System.out.println(p1.toString());
            p1.setPriority(8);
            System.out.println(p1.toString());
            p1.setSerialNumber("AP12");
            System.out.println(p1.toString());
        } else {
            System.out.println("Project is null");
        }
    }

    public void testClassHierarchy() {
        ArrayList<Event> projects = new ArrayList<>();
        ArrayList<Event> courses = new ArrayList<>();
        ArrayList<Event> assignments = new ArrayList<>();
        Event p1 = new Project(3, "todolist", "P123", 
                                        "title3", "startDate", "endDate", 
                                        "description", "categories");
        Event p2 = new Project(4, "todolist", "P321", 
                                        "title2", "startDate", "endDate", 
                                        "description", "categories");
        Event p3 = new Project(2, "todolist", "P252", 
                                        "title1", "startDate", "endDate", 
                                        "description", "categories");
        Event c1 = new Course("Peggy Fisher", "assignment", "C123", 
                                        "IST 261", "startDate", "endDate", 
                                        "description", "categories");
        Event c2 = new Course("Peggy Fisher", "assignment", "C321", 
                                        "IST 311", "startDate", "endDate", 
                                        "description", "categories");
        Event c3 = new Course("Peggy Fisher", "assignment", "C261", 
                                        "IST 230", "startDate", "endDate", 
                                        "description", "categories");
        Event a1 = new Assignment("IST 261", "A123", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        Event a2 = new Assignment("IST 311", "A321", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        Event a3 = new Assignment("IST 230", "A261", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        for (Event project : projects) {
            System.out.println(project.getProjectDetails());
        }
        for (Event course : courses) {
            System.out.println(course.getCourseDetails());
        }
        for (Event assignment : assignments) {
            System.out.println(assignment.getAssignmentDetails());
        }
    }
    
    public void testInterface() {
        ArrayList<Printable> projects = new ArrayList<>();
        ArrayList<Printable> courses = new ArrayList<>();
        ArrayList<Printable> assignments = new ArrayList<>();
        Printable p1 = new Project(3, "todolist", "P123", 
                                        "title3", "startDate", "endDate", 
                                        "description", "categories");
        Printable p2 = new Project(4, "todolist", "P321", 
                                        "title2", "startDate", "endDate", 
                                        "description", "categories");
        Printable p3 = new Project(2, "todolist", "P252", 
                                        "title1", "startDate", "endDate", 
                                        "description", "categories");
        Printable c1 = new Course("Peggy Fisher", "assignment", "C123", 
                                        "IST 261", "startDate", "endDate", 
                                        "description", "categories");
        Printable c2 = new Course("Peggy Fisher", "assignment", "C321", 
                                        "IST 311", "startDate", "endDate", 
                                        "description", "categories");
        Printable c3 = new Course("Peggy Fisher", "assignment", "C261", 
                                        "IST 230", "startDate", "endDate", 
                                        "description", "categories");
        Printable a1 = new Assignment("IST 261", "A123", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        Printable a2 = new Assignment("IST 311", "A321", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        Printable a3 = new Assignment("IST 230", "A261", 
                                        "JAVA Interface", "startDate", "endDate", 
                                        "description", "categories");
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        for (Printable project : projects) {
            project.printSetup();
        }
        p1.printSetup();
        p1.print();
        for (Printable course : courses) {
            course.printSetup();
        }
        c1.printSetup();
        c1.print();
        for (Printable assignment : assignments) {
            assignment.printSetup();
        }
        a1.printSetup();
        a1.print();
    }
}
