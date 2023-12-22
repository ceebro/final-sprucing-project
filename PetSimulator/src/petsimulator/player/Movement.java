package petsimulator.player;

import player.Player;

/**
 * Movement.java - description
 *
 * @author Daniel Jun
 * @since Oct 10, 2023, 12:59:54 p.m.
 */
public class Movement {

    /**
     * Default constructor, set class properties
     */
    public final static boolean STOPPED = true;
    private static final int MOVE_SPEED = 5;
    
    Player player;
    
    public Movement(Player player) {
        this.player = player;
    }

    public void move(int key, int x, int y) {
        if (player.UP) {
            y -= MOVE_SPEED;
        }
        if (player.DOWN) {
            y += MOVE_SPEED;
        }
        if (player.LEFT) {/**/
            x -= MOVE_SPEED;
        }
        if (player.RIGHT) {
            x += MOVE_SPEED;
        }
        player.update(x, y);
    }

    public void keyReleased(int key) {

    }

}
