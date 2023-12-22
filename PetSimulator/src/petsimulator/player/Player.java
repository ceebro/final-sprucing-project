package player;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import petsimulator.player.Movement;

/**
 * Player.java - description
 *
 * @author Daniel Jun
 * @since Oct 6, 2023, 11:27:18 a.m.
 */
public class Player extends JLabel {

    /**
     * Default constructor, set class properties
     */
    
    public Movement movement = new Movement(this);
    public boolean UP = false;
    public boolean DOWN = false;
    public boolean LEFT = false;
    public boolean RIGHT = false;
    final static int W = KeyEvent.VK_W;
    final static int A = KeyEvent.VK_A;
    final static int S = KeyEvent.VK_S;
    final static int D = KeyEvent.VK_D;

    public Player(int startX, int startY, int width, int height) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("C:\\Users\\c.marable\\Desktop\\JUN.jpg\\"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = image.getScaledInstance(width, height,
                    
        Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        this.setIcon(imageIcon);
        this.setBounds(startX, startY, width, height);
        //this.setBackground(Color.BLACK);
        //this.setOpaque(true);
    }

    public void move(int key) {
        findDirection(key);
        movement.move(key, this.getX(), this.getY());
    }

    public void update(int x, int y) {
        this.setLocation(x, y);
    }

    private void findDirection(int key) {
        if (key == W) {
            UP = true;
        }
        if (key == A) {
            LEFT = true;
        }
        if (key == S) {
            DOWN = true;
        }
        if (key == D) {
            RIGHT = true;
        }

    }

    public void changeStatus(int key) {
        if (key == W) {
            UP = false;
        }
        if (key == A) {
            LEFT = false;
        }
        if (key == S) {
            DOWN = false;
        }
        if (key == D) {
            RIGHT = false;
        }
    }

}