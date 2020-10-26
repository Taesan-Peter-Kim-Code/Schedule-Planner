package view;

import controller.EventCntl;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author taesankim
 */
public class EventListUI extends JFrame{
    private JPanel tablePanel, buttonPanel;
    private JTable eventTable;
    public JButton doneButton, detailsButton, newButton, deleteBtn;
    private JScrollPane tableScroller;
    private EventCntl eventCntl;
    
    public EventListUI(EventCntl eventCntl) {
        this.eventCntl = eventCntl;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void initComponents() {
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 4));
        eventTable = new JTable(eventCntl.getEventTableModel());
        
        doneButton = new JButton("Done");
        detailsButton = new JButton("Show Details");
        detailsButton.addActionListener(new DetailsButtonListener());
        newButton = new JButton("New");
        deleteBtn = new JButton("Delete");
        buttonPanel.add(newButton);
        buttonPanel.add(detailsButton);
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteBtn);
        tableScroller = new JScrollPane(eventTable);
        eventTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350, 300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);  
    }
    public int getSelectedRow()
    {
         int selectedTableRow = eventTable.getSelectedRow();
            int selectedModelRow = eventTable.convertRowIndexToModel(selectedTableRow);
            return selectedModelRow;
    }

public class DetailsButtonListener implements ActionListener {
        
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedTableRow = eventTable.getSelectedRow();
        int selectedModelRow = eventTable.convertRowIndexToModel(selectedTableRow);
        EventListUI.this.eventCntl.getEventDetailUI(selectedModelRow);
        
        // setVisible(false);
    }
}
}
