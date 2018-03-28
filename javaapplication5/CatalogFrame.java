
package javaapplication5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class CatalogFrame extends JFrame {
    DocumentForm form = new DocumentForm(this);
    CatalogList list = new CatalogList();
    ControlPanel control = new ControlPanel(this);       
   	
    public CatalogFrame() {
        super("Visual Document Manager");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(700, 500));
        setResizable(false);
        
        add(form, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }		
    
    public void addToList(String item) 
    {
        list.addDocument(item);
    }
}
