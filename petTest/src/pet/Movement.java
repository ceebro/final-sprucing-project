package pet;

/**
 * Movement.java - description
 *
 * @author Chylsy Marable
 * @since Nov 30, 2023, 11:18:54 a.m.
 */
public interface Movement {
    
    
    
    
     /**
     * accessor method, gets x coordinate of pet
     *
     * @return - x coordinate of pet
     */
    public abstract int getX();

    /**
     * mutator method, sets x coordinate of pet
     */
    public abstract void setX(int x);

    /**
     * accessor method, gets y coordinate of pet
     *
     * @return - y coordinate of pet
     */
    public abstract int getY();

    /**
     * mutator method, sets y coordinate of pet
     */
    public abstract void setY(int y);
}
