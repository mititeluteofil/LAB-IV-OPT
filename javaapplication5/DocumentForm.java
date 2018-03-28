package javaapplication5;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.BorderFactory;
import javax.swing.SpinnerNumberModel;


public class DocumentForm extends javax.swing.JPanel {

    private final CatalogFrame frame;
    String titleInput;
    String pathInput;
    int yearInput;
    Boolean isPlaying = false;
    
    String bip = "bip.mp3";
    Media hit = new Media(new File(bip).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);
    
    public DocumentForm(CatalogFrame frame) {
        this.frame = frame;
        String title = "<html><i><font color='blue'>" + 
		    "Add document" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        initComponents();
    }

    //Cod generat automat pentru pozitionare
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        titleArea = new javax.swing.JTextField();
        pathLabel = new javax.swing.JLabel();
        pathArea = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearSpinner = new javax.swing.JSpinner(
            new SpinnerNumberModel(1950, 1900, 2017, 1));
        addButton = new javax.swing.JButton();
        toggleButton = new javax.swing.JToggleButton();

        titleLabel.setText("Title of the document:");

        titleArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleAreaActionPerformed(evt);
            }
        });

        pathLabel.setText("Path of the document:");

        pathArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathAreaActionPerformed(evt);
            }
        });

        yearLabel.setText("Publication year:");

        addButton.setText("Add to repository");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        toggleButton.setText("Music");
        toggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleArea)
                    .addComponent(pathArea)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel)
                            .addComponent(pathLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearSpinner))
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearLabel)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(toggleButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //Finalul codului generat automat
    
     
    private void titleAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleAreaActionPerformed

    }//GEN-LAST:event_titleAreaActionPerformed

    private void pathAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathAreaActionPerformed

    }//GEN-LAST:event_pathAreaActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       titleInput = titleArea.getText();
       if(titleInput.length() < 5)
       {
           System.out.println("Title is too small");
       }
       else
       {
           pathInput = pathArea.getText();
           yearInput = (Integer)yearSpinner.getValue();
           if(pathInput.length() < 5)
           {
               System.out.println("Path is too small");
           }
           else
           {
              frame.addToList(titleInput+" ," + yearInput + " [" + pathInput + "]");
           }
       }
       
    }//GEN-LAST:event_addButtonActionPerformed

    private void toggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonActionPerformed
        if(isPlaying == false){
            mediaPlayer.play();
            isPlaying = true;
        }
        else{
            mediaPlayer.pause();
            isPlaying = false;
        }
    }//GEN-LAST:event_toggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField pathArea;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JTextField titleArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables
}
