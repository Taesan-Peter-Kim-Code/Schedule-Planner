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
public class EventList {
    private ArrayList<Event> eventList = new ArrayList<>();
    private String eventsFileName = "events.ser";
    
    public EventList() {
        this.readEventListFile();
        if(eventList.isEmpty() || eventList == null){
            createList();
            writeEventListFile();
            readEventListFile();
        }
        printEventList();
    }
    
    public void createList() {
        Event a1 = new Event("serialNumber1", "title1", "01/23/2020", "02/22/2020", "description", "categories");
        Event a2 = new Event("serialNumber2", "title2", "01/23/2020", "02/22/2020", "description", "categories");
        Event a3 = new Event("serialNumber3", "title3", "01/23/2020", "02/22/2020", "description", "categories");
        Event a4 = new Event("serialNumber4", "title4", "01/23/2020", "02/22/2020", "description", "categories");
       
        eventList.add(a1);
        eventList.add(a2);
        eventList.add(a3);
        eventList.add(a4);
       
    }
    
    public void readEventListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(eventsFileName);
            in = new ObjectInputStream(fis);
            eventList = (ArrayList)in.readObject();
            in.close();
            if(!eventList.isEmpty())
                System.out.println("There were events in the file");
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
    
    public void writeEventListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(eventsFileName);
            out =  new ObjectOutputStream(fos);
            out.writeObject(eventList);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
    public void printEventList(){
        for (Event event : eventList) {
            System.out.println(event.toString());
        }
            
    }
    
    public ArrayList<Event> getEventList() {
        return eventList;
    }
}
