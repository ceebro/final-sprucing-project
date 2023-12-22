package petsimulator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ScreenMaker.java - description
 *
 * @author Daniel Jun
 * @since Oct 4, 2023, 11:49:15 a.m.
 */
public class ScreenMaker extends JFrame {

    /**
     * Default constructor, set class properties
     */
    public ScreenMaker(int width, int height) {

        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    }
    public JLabel createLabel(int xPos,int yPos,int width,int height){
      JLabel label = new JLabel();
      label.setBounds(xPos, yPos, width, height);
    
      return label;
    }
    public JButton createButton(int x,int y,int width,int height,String text){
        JButton button = new JButton();
        button.setBounds(x, y, width, height);
        button.setText(text);
        button.setVisible(true);
        this.add(button);
        return button;
    }
}