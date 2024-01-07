/** Required package class namespace */
package pet;

 
/**
 * Pet.java - description
 *
 * @author Chylsy Marable
 * @since Dec 15, 2023, 11:16:21 a.m.
 */
public abstract class Pet implements Movement {

    /*
        public static String name;
        public static String species;
        public static int hunger;
        public static int happiness;

        public InputName input;
        public StatsWindow statsWindow;
     */
    public static String name;
    private static String species;
    public String pathway;
    public int hunger;
    public int happiness;
    protected int x, y;

    public Pet(String species, String pathway) {
        // name will be set later
        this.species = species;
        this.pathway = pathway;
    }

    /**
     * outputs pet stats
     */
    public abstract void outputPetStats();

    /**
     * decreases hunger of pet
     */
    public abstract void hungerDecrease();

    /**
     * increases hunger of pet(feeds it)
     */
    public abstract void feed();

    /**
     * plays with the pet (gets hungry)
     */
    public abstract void play();

    /**
     * neglects the pet (happiness goes down)
     */
    public abstract void neglect();
    public String species(){
        return species;
    }
}
