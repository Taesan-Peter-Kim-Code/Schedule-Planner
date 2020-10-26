package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Event;
import model.EventList;
import model.EventTableModel;
import view.EventListUI;
import view.EventUI;

/**
 *
 * @author taesankim
 */
public class EventCntl implements ActionListener{
    private NavigationCntl navCntl;
    private EventList eventList;
    private EventTableModel theEventTableModel;
    private ArrayList<Event> listOfEvents;
    private EventUI eventUI;
    private int currentEvent = 0;
    private Event event;
    private EventListUI eventListUI;
    
    EventCntl(NavigationCntl navCntl) {
        this.navCntl = navCntl;
        eventList = new EventList();
        listOfEvents = eventList.getEventList();
        theEventTableModel = new EventTableModel(eventList.getEventList());
        createEventUI();
        createEventListUI();
        eventListUI.setVisible(true);  
        eventUI.setVisible(false);
        
    }
    
    public void createEventUI() {
        eventUI = new EventUI(this,listOfEvents.get(currentEvent));
        eventUI.prevBtn.addActionListener(this);
        eventUI.nextBtn.addActionListener(this);
        eventUI.updateBtn.addActionListener(this);
        eventUI.addBtn.addActionListener(this);
        eventUI.deleteBtn.addActionListener(this);
        eventUI.quitBtn.addActionListener(this);
        eventUI.cancelBtn.addActionListener(this);
        eventUI.saveBtn.addActionListener(this);
        eventUI.backBtn.addActionListener(this);
        eventUI.cancelBtn.setVisible(false);
        eventUI.saveBtn.setVisible(false);
    }
    
    public void createEventListUI() {
        eventListUI = new EventListUI(this);
        eventListUI.doneButton.addActionListener(this);
        eventListUI.newButton.addActionListener(this);
        eventListUI.deleteBtn.addActionListener(this);
    }
    
    public EventTableModel getEventTableModel() {
        return theEventTableModel;
    }
    
    public Event getEvent(int selectedRow) {
        return listOfEvents.get(selectedRow);
    }
    
    public void getEventDetailUI(int selectedRow) {
        event = (listOfEvents.get(selectedRow));
        eventUI.updateData(event);
        eventUI.setVisible(true);
        eventListUI.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (obj == eventUI.nextBtn) {
            if(currentEvent < listOfEvents.size()-1){
                currentEvent++;
                eventUI.updateData(listOfEvents.get(currentEvent));
            }
            else{ 
                System.out.println("End of list");
            }
        }
        
        if(obj == eventListUI.newButton)
        {
            eventUI.cancelBtn.setVisible(true);
            eventUI.saveBtn.setVisible(true);
            eventUI.updateBtn.setVisible(false);
            eventUI.newData(); 
            eventUI.setVisible(true);
            eventUI.setVisible(false);
            
        }
        
        if(obj == eventUI.backBtn){
            eventUI.setVisible(false);
            eventListUI.setVisible(true);
        }
        
        else if (obj == eventUI.prevBtn) {
            if(currentEvent == 0){
                currentEvent = listOfEvents.size()-1;
            }
            else {
                currentEvent--;
            }
            eventUI.updateData(listOfEvents.get(currentEvent));
        }
        
        else if (obj == eventUI.addBtn) {
            eventUI.cancelBtn.setVisible(true);
            eventUI.saveBtn.setVisible(true);
            eventUI.updateBtn.setVisible(false);

            eventUI.newData();
        }
        
        else if (obj == eventUI.updateBtn) {
            listOfEvents.get(currentEvent).setTitle(eventUI.getTitle());
            eventList.writeEventListFile();
        }
        
        else if (obj == eventUI.saveBtn) {
            Event event = new Event(eventUI.getTitle(), 
                    eventUI.getStartDate(), eventUI.getEndDate(), 
                    eventUI.getSerialNum(), eventUI.getCategories(),
                    eventUI.getDescription());
            listOfEvents.add(event);
            eventList.writeEventListFile();
            eventUI.cancelBtn.setVisible(false);
            eventUI.saveBtn.setVisible(false);
            eventUI.updateBtn.setVisible(false);
        }
        
        else if (obj == eventUI.deleteBtn) {
            listOfEvents.remove(currentEvent);
            eventList.writeEventListFile();
            getEventTableModel().fireTableDataChanged();
            
        }
        
        else if (obj == eventUI.quitBtn || obj == eventListUI.doneButton) {
            System.exit(0);
        }
    }
}
