package petsimulator;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import player.Player;

/**
 * GameScreen.java - description
 *
 * @author Daniel Jun
 * @since Oct 6, 2023, 11:27:09 a.m.
 */
public class GameScreen {

    /**
     * Default constructor, set class properties
     */
    final static int WIDTH = 500;
    final static int HEIGHT = 500;

    final static int PLAYER_WIDTH = 25;
    final static int PLAYER_HEIGHT = 15;
    final static int PLAYER_X = PLAYER_WIDTH;
    final static int PLAYER_Y = PLAYER_HEIGHT;
    KeyListener keyPressed = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {   
            player.move(e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            player.changeStatus(e.getKeyCode());
        }
    };
    
    ScreenMaker game = new ScreenMaker(WIDTH, HEIGHT);
    Player player = new Player(PLAYER_X,PLAYER_Y,PLAYER_WIDTH,PLAYER_HEIGHT);
    public GameScreen() {
        
        game.add(player);
        game.addKeyListener(keyPressed);
        game.show();
    }
}