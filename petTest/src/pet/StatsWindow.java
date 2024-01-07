/** Required package class namespace */
package pet;

import javax.swing.*;
import java.awt.*;

/**
 * StatsWindowTest.java - description
 *
 * @author Chylsy Marable
 * @since Nov 21, 2023, 12:28:38 p.m.
 */
public class StatsWindow extends JFrame {

    Pet pet;

    private JButton okButton;
    private JLabel title;
    private JLabel outputName;
    private JLabel outputHunger;
    private JLabel outputHappiness;
    
    Color pink = Color.decode("#E5ADA8");;
    Color vanilla = Color.decode("#E5E0D8");
    Color caramel = Color.decode("#D0A77B");
    Color chocolate = Color.decode("#725C3F");
    Color offWhite = Color.decode("#EFE8D8");
    Color mint = Color.decode("#D8D7B2");
    
    //colors:
    //#E5ADA8(STRAWBERRYPINK) #E5E0D8(VANILLA) #D0A77B(CARAMELTSUYUKI)
    //#725C3F(CHOCOLATE) #EFE8D8(OFFWHITE) #D8D7B2(MINTGREEN)
    
    private JLabel catGraphic;
    ImageIcon cat = new ImageIcon("C:\\Users\\c.marable\\Desktop\\cat_play.gif");

    public StatsWindow(Pet pet) {

        this.pet = pet;

        title = new JLabel();
        outputName = new JLabel();
        outputHunger = new JLabel();
        outputHappiness = new JLabel();
        okButton = new JButton();
        catGraphic = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBackground(pink);
        setSize(705, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        title.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        title.setForeground(chocolate);
        title.setText("Pet Stats (=^_^=)");

        outputName.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        outputName.setForeground(chocolate);
        outputName.setText("Name: " + pet.name);

        outputHunger.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        outputHunger.setForeground(chocolate);
        outputHunger.setText("Hunger:" + pet.hunger);

        outputHappiness.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        outputHappiness.setForeground(chocolate);
        outputHappiness.setText("Happiness:" + pet.happiness);

        okButton.setBackground(offWhite);
        okButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        okButton.setForeground(pink);
        okButton.setText("OKAY");
        okButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        catGraphic.setIcon(cat);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(276, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(outputHunger, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(outputName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(outputHappiness, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(title, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(catGraphic, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(title, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(outputName, GroupLayout.PREFERRED_SIZE, 85,GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(outputHunger, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(outputHappiness, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(catGraphic, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
        );
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
         
    }
}
