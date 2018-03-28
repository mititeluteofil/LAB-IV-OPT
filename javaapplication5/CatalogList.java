package javaapplication5;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;

import businessModel.Document;


public class CatalogList extends JList {
    DefaultListModel model = new DefaultListModel<>();
	CatalogFrame frame;
    public CatalogList(CatalogFrame frame) {
    	this.frame = frame;
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);        
    }    
    public void addDocument(String item) {
        model.addElement(item);
    }
    public void addDocument(Document item) {
        //model.addElement(item.toString());
        frame.catalog.add(item);
    }
}	
