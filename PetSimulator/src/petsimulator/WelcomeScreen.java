package petsimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * WelcomeScreen.java - description
 *
 * @author Daniel Jun
 * @since Oct 5, 2023, 11:28:43 a.m.
 */
public class WelcomeScreen {

    public static final int WIDTH = 250;
    public static final int HEIGHT = 250;
    public static final int TOP_SCREEN = 0;
    public static final int LEFT_SCREEN = 0;
    ScreenMaker screen = new ScreenMaker(WIDTH, HEIGHT);
    JButton playButton;
    ActionListener play = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            PetSimulator.playGame();
            screen.dispose();
        }
    };
    
    /**
     * Default constructor, set class properties
     */
    public WelcomeScreen() {

        playButton = makeButton("Play", (WIDTH / 2), TOP_SCREEN);
        
        
        addActions();
        
        screen.setVisible(true);
    }

    private JButton makeButton(String text, int xPos, int yPos) {
        final int BUTTON_SPACING = 30; //space between buttons
        final int BUTTON_WIDTH = 50;
        final int BUTTON_HEIGHT = 25;
        JButton button = screen.createButton(
                xPos - BUTTON_WIDTH / 2, //aligns x coordinate to center of screen
                yPos + BUTTON_SPACING,
                BUTTON_WIDTH,
                BUTTON_HEIGHT,
                text);

        return button;
    }

    private void addActions() {
        playButton.addActionListener(play);
    }
}