/** Required package class namespace */
package pet;

import pet.StatsWindow;
import pet.InputName;


 
/**
 * Pet.java - description
 *
 * @author Chylsy Marable
 * @since Nov 1, 2023, 11:27:32 a.m.
 */
public class Cat 
{

    public static String name;
    public static String species;
    public static int hunger;
    public static int happiness;
    
    public InputName input;
    public StatsWindow statsWindow;
    
    /**
     * Default constructor, set class properties
     */
    public Cat() {
                
        input = new InputName(this); //calling inputName JFrame
        input.setVisible(true);
        
        hunger = 100;
        happiness = 100;
    }
    
    public void outputPetStats(){
                
        statsWindow = new StatsWindow(this);
        statsWindow.setVisible(true);
    }
    
    public void hungerDecrease(){
        
        hunger -= 10;
    }
    
    public void feed(){
        
        hunger += 10;
    }
    
    public void play(){
        
        hunger += 10;
    }
    
    public void neglect(){
        
        hunger =+ 10;
    }
    
}
