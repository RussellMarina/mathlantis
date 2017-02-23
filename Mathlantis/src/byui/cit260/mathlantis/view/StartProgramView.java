/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.view;

import byui.cit260.mathlantis.control.GameControl;
import java.util.Scanner;
import byui.cit260.mathlantis.model.Player;


/**
 *
 * @author Marina
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView(){
        
        this.promptMessage = "\nPlease enter your name: ";
        //promptMessage ="please enter your name"
       //dixplay the banner when view is created
       this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
        "\n********************************************"
        + "\n*                                         *"
        + "\n* You are an explorer trying to locate the *"
        +"\n* lost city of Atlantis.  Your search brings*"
        +"\n* you to the depths of the ocean as you look*"
        +"\n* for a mythical map leading to the city.  *"
        +"\n* As you search for the map, you will have*"
        +"\n* to enter an ancient underwater ruin,     *"
        +"\n* a shipwreck, a cave, the ocean’s sandy    *"
        +"\n* depths, etc.  The goal is to find the map *"
        +"\n* of Atlantis.  There will be 25 equations in *"
        +"\n* 25 locations, underwater.  One room to start,*"
        +"\n* unlocks the next, and then that room unlocks *"
        +"\n* the next, and so on and so forth.  *"
        +"\n*                                     *"
        +"\n***************************************"
        );
    }
/**
 * display the start program view
 */
    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get playersName
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
            return; // exit the game
            
            //do requested action and display next view
            done = this.doAction(playersName);
        }while (!done);
        
     }

    private String getPlayersName() {
       Scanner keyboard = new Scanner (System.in); //get infile for keyboard
       String value = ""; // value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {//loop while an invalid value is enter
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() < 1 ){// value is blank
               System.out.println("\nInvalid value:value can not be blank");
               continue;
           }
           break; //end the loop
       }
       return value; //return the value entered
    }

    private boolean doAction(String playersName) {
         if (playersName.length() <2){
             System.out.println("\nInvalid players name:"
             +"The name must be greater than one character in length");
             return false;
         }
         //call createPlayer() control function
         Player player = GameControl.createPlayer(playersName);
         if (player == null) {//if unsuccessfull
             System.out.println("\nError creating the player.");
             return false;
         }
         //display next view
         this.displayNextView(player);
         
         return true; //success!
    }

    private void displayNextView(Player player) {
       System.out.println("\n====================================="
                            +"\n Welcome to the game " + player.getName()
                            +"\n We hope you have a lot of fun!"
                            +"\n=================================="
                            );
       //create MainMenuView object
       MainMenuView mainMenuView = new MainMenuView();
               
      // Display the main menu view
      mainMenuView.MainMenuView();
      mainMenuView.displayMainMenuView();
    }
    
}
