/** Required package class namespace */
package pet;

import javax.swing.*;
import java.awt.*;

 
/**
 * InputNameTest.java - description
 *
 * @author Chylsy Marable
 * @since Nov 30, 2023, 11:18:54 a.m.
 */
public class InputName extends JFrame
{

    Cat pet;
    
    private Button confirmName;
    private JLabel title;
    private JLabel enterMessage;
    ImageIcon petGraphic = new ImageIcon("C:\\Users\\c.marable\\Desktop\\dog.gif");
    private JLabel graphic;
    private TextField inputName;    
    
    /**
     * Default constructor, set class properties
     */
    public InputName(Cat pet) {
        
        this.pet = pet;
        
        title = new JLabel();
        enterMessage = new JLabel();
        inputName = new java.awt.TextField();
        confirmName = new java.awt.Button();
        graphic = new JLabel();
        
        setSize(700,600);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        title.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); 
        title.setText("Pet Simulator :3");

        enterMessage.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); 
        enterMessage.setText("Enter your pet's name:");

        confirmName.setActionCommand("OKAY");
        confirmName.setBackground(Color.decode("#E5E0D8"));
        confirmName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); 
        confirmName.setForeground(Color.decode("#E5ADA8"));
        confirmName.setLabel("OKAY");
        confirmName.setName(""); 
        confirmName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        graphic.setIcon(petGraphic); 
        
        //<editor-fold>
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(title, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputName, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(confirmName, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(enterMessage, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(graphic, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(graphic, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(enterMessage, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputName, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        //</editor-fold>
    }
                                    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        pet.name = inputName.getText();
        pet.outputPetStats();
    }   
    
}
