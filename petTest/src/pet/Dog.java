/** Required package class namespace */
package pet;

import pet.StatsWindow;
import pet.InputName;

/**
 * Dog.java - description - Dog is another available pet 
 *
 * @author Chylsy Marable
 * @since Nov 1, 2023, 11:27:32 a.m.
 */
public class Dog extends Pet {


    public InputName input;
    public StatsWindow statsWindow;

    /**
     * Default constructor, set class properties
     */
    public Dog(String species,String pathway) {
        
        super(species,pathway);
        input = new InputName(this,"Icon Pathway"); //calling inputName JFrame
        input.setVisible(true);

        hunger = 100;
        happiness = 100;
        
    }

    @Override
    public int getX() {

        return this.x;

    }

    @Override
    public void setX(int x) {

        this.x = x;

    }

    @Override
    public int getY() {

        return this.y;

    }

    @Override
    public void setY(int y) {
        
        this.y = y;
        
    }

    @Override
    public void outputPetStats() {
        
        statsWindow = new StatsWindow(this);
        statsWindow.setVisible(true);

    }

    @Override
    public void hungerDecrease() {
        
        hunger -= 10;
        
    }

    @Override
    public void feed() { //possible recursive method(continuously eat until full)
        
        hunger += 10;
        
    }

    @Override
    public void play() {
        
        hunger -= 10;
        happiness += 10;
        
    }

    @Override
    public void neglect() {
        
        happiness -= 10;
        
    }
}
