package pet;

/**
 *
 * @author iamda
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
