/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author taesankim
 */
public class EventTest {
    
    public EventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of toString method, of class Event.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "Basic Information(" + "Serial Number: " + "serialNumber" +
                "\nTitle: " + "title" +
                "\nStart Date: " + "startDate" +
                "\nEnd Date: " + "endDate" +
                "\nDescription: " + "description" +
                "\ncategories: " + "categories" + ")";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSerialNumber method, of class Event.
     */
    @Test
    public void testGetSerialNumber() {
        System.out.println("getSerialNumber");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "serialNumber";
        String result = instance.getSerialNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSerialNumber method, of class Event.
     */
    @Test
    public void testSetSerialNumber() {
        System.out.println("setSerialNumber");
        String serialNumber = "new serialNumber";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setSerialNumber(serialNumber);
        assertEquals(serialNumber, instance.getSerialNumber());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Event.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Event.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "new title";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Event.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "startDate";
        String result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Event.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        String startDate = "new startDate";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setStartDate(startDate);
        assertEquals(startDate, instance.getStartDate());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Event.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "endDate";
        String result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Event.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        String endDate = "new endDate";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setEndDate(endDate);
        assertEquals(endDate, instance.getEndDate());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Event.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "description";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Event.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "new description";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setDescription(description);
        assertEquals(description, instance.getDescription());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class Event.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        String expResult = "categories";
        String result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setCategories method, of class Event.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        String categories = "new categories";
        Event instance = new Event("serialNumber", "title", "startDate", "endDate", "description", "categories");
        instance.setCategories(categories);
        assertEquals(categories, instance.getCategories());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
