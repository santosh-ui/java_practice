/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startup;
import java.util.ArrayList;
/**
 *
 * @author Santosh
 */
public class StartupBust {
    
    // variable declarations
    // Declare and initialize the variables we'll need
//    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses;
    
    // method declarations
    public void setUpGame() {
        // Make 3 startups(Startup objects), give 'em names, stick 'em in the ArrayList
        Startup one = new Startup();
        one.setName("Google");
        startups.add(one);
        Startup two = new Startup();
        two.setName("Apple");
        startups.add(two);
        Startup three = new Startup();
        three.setName("Netflix");
        startups.add(three);
        
        // print brief instructions for user
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        // Repeat with each startup in the list
        for (Startup startup: startups) {
            // Ask the helper for a Startup location (ArrayList of Strings)
            ArrayList<String> newLocation = helper.placeStartup(3);
            // call the setter method on this Startup to give it the location you just
            // got from the helper
            startup.setLocationCells(newLocation);
        } // close for loop
    } // close setUpGame method
    
    public void startPlaying() {
        // As long as the startups list is NOT empty
        // (the ! means NOT, it's the same as (startup.isEmpty() == false))
        while (!startups.isEmpty()) {
            // Get the user input
            String userGuess = helper.getUserInput();
            // call our own checkUserGuess method
            checkUserGuess(userGuess);
        }
        finishGame(); // call our own finishGame method
    } // close startPlaying method
    
    public void checkUserGuess(String userGuess) {
        // increment the number of guesses the user has made
        numOfGuesses++;
        // Assume it's a "miss", unless told otherwise
        String result = "miss";
        
        // Repeat with all startups in the list
        for(Startup startupToTest: startups) {
            // Ask the Startup to check the user guess, looking for a "hit", or ("kill")
            result = startupToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                // Get out of the loop early, no point in testing the others
                break;
            }
            if (result.equals("kill")) {
                // This one's dead, so take it out of the startups list then get out of the loop
                startups.remove(startupToTest);
                break;
            }
        } // close for loop
        
        // print the result for the user
        System.out.println(result);
    } // close checkUserGuess method
    
    /**
     * @param none
     * @return void
     */
    private void finishGame() {
        // print a message telling the user how they did in the game
        System.out.println("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    } // close finishGame method
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create the game object
        StartupBust game = new StartupBust();
        // tell the game object to setup the game
        game.setUpGame();
        // tell the game object to start the main game play loop
        // (keeps asking for user input and checking the guess)
        game.startPlaying();        
    } // close main method
}
