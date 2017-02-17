/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.view;

import byui.cit260.mathlantis.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage;
    private Object Mathlantis;
    public MainMenuView(){
        this.menu = "\n"
                  +"\n--------------------------------------"
                  +"\n| Main Menu                          |"
                + "\n---------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game "
                + "\nQ - Quit"
                + "\n-------------------------------------";
    }
    /**
     * displays the start program view
     */
    public void displayMainMenuView(){
        
        boolean done = false; // set flag to not done
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))// user wants to quit
                    return; // exit the game
           // do the requested action and display the next view
           done = this.doAction(menuOption);
           
        }while (!done);
        
        
    }

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value =""; // value to be rturned
       boolean valid = false; // initialize to not valid
       
       while (!valid){// loop while an invalid value is enter
           System.out.println("\n" +this.promptMessage);
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           if(value.length()< 1) {//value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; // end the loop
       }
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Mathlantis.getPlayer());
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
