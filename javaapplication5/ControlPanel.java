package javaapplication5;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import businessModel.*;

public class ControlPanel extends JPanel {
    private final CatalogFrame frame;
    JButton loadButton = new JButton("Load");
    JButton saveButton = new JButton("Save");
    
    public ControlPanel(CatalogFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        add(loadButton);
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
    }

    protected void saveButtonActionPerformed(ActionEvent evt) {
    	
    		frame.catalog.save("D:\\Catalog.dat"); 
 
	}
	private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
		DefaultListModel listModel = (DefaultListModel) frame.list.getModel();
        listModel.removeAllElements();
    	try {
    		frame.catalog = Catalog.load("D:\\Catalog.dat"); 
    		int size = frame.catalog.getDocuments().size();
            for (int i = 0; i < size; i++) {
            	frame.addToList(frame.catalog.myDocuments.get(i).toString());
            	System.out.println(frame.catalog.myDocuments.get(i).toString());
            }
    		
        }
        catch(IOException | ClassNotFoundException exp){
            exp.printStackTrace();
        }
    	
    	
    	
        }

    
    
   
}
