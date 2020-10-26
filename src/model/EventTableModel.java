/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author taesankim
 */
public class EventTableModel extends AbstractTableModel{
    
    private String[] columnNames = {"Title", "Category", "Serial Num"};
    private ArrayList<Event> eventList;
   
    public EventTableModel(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
    
    @Override
    public int getRowCount() {
        return eventList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];       
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return (Object)eventList.get(rowIndex).getTitle();
            case 1: return (Object)eventList.get(rowIndex).getCategories();
            case 2: return (Object)eventList.get(rowIndex).getSerialNumber();
            default: return null;
        }
    }
    
}
