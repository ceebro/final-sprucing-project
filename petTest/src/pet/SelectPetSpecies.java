/** Required package class namespace */
package pet;

 
/**
 * SelectPetSpecies.java - description
 *
 * @author Chylsy Marable
 * @since Dec 15, 2023, 11:25:53 a.m.
 */
public class SelectPetSpecies {

    /**
     * Default constructor, set class properties
     */
    JFrame screen = new JFrame();
    private String[] species = {"Cat", "Dog"};
    JButton catOption = new JButton();
    JButton dogOption = new JButton();

    private String CAT_PATHWAY = "Cat Icon Pathway";
    private String DOG_PATHWAY = "Dog Icon Pathway";

    public SelectPetSpecies() {

        makeButtons();
        addActions();
        screen.setSize(1000, 1000);
        screen.setLayout(new FlowLayout());

        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.add(catOption);
        screen.add(dogOption);
        screen.setLocationRelativeTo(null);
        
        screen.show();

    }

    private void makeButtons() {

        catOption.setSize(150, 200);
        catOption.setText(species[0]);

        dogOption.setSize(150, 200);
        dogOption.setText(species[1]);

    }

    private void addActions() {
        catOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catButtonPressed(evt);
            }
        });
        dogOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogButtonPressed(evt);
            }
        });

    }

    private void catButtonPressed(ActionEvent evt) {
        Cat cat = new Cat("Cat",CAT_PATHWAY);
        screen.dispose();
    }
    private void dogButtonPressed(ActionEvent evt) {
        Dog dog = new Dog("Dog",DOG_PATHWAY);
        screen.dispose();
    }
}
