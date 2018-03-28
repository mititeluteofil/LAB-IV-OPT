/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Ssive
 */
import java.awt.Desktop;
import java.io.*;
import java.util.*;
import java.util.List;


public class Catalog implements java.io.Serializable {

    private ArrayList<Document> myDocuments ;
    
    public Catalog() {
        this.myDocuments = new ArrayList<>();
    }
        
    public void open(String path) {
        try {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }

            desktop.open(new File(path));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public List<Document> getDocuments() {
        return myDocuments;
    }
	
    public void add(Document doc) {
        myDocuments.add(doc);
    }

    public void list() {
        int size = this.myDocuments.size();
        for (int i = 0; i < size; i++) {
            System.out.println(this.myDocuments.get(i));
        }
    }
    
    public void save(String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Catalog load(String path)throws IOException, ClassNotFoundException{		
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        return (Catalog) objectInputStream.readObject();
    }
}
