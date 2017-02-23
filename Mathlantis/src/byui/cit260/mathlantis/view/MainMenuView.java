/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.view;

import byui.cit260.mathlantis.control.GameControl;
import byui.cit260.mathlantis.model.Questions;
import byui.cit260.mathlantis.control.QuestionControl;
import byui.cit260.mathlantis.model.Player;
import java.util.Scanner;
import mathlantis.Mathlantis;

/**
 *
 * @author Marina
 */
public class MainMenuView {
    
       
    private String menu;
    private String promptMessage;
    private Object Mathlantis;
    public void MainMenuView(){
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
        System.out.println(menu);
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
        GameControl theGameControl = new GameControl();
        System.out.println("\nEnter Player name, then press Enter");
        //GameControl GameControl = GameControl.createNewGame(Mathlantis.getPlayer());
        // display the game menu
        String new_name = this.getinput_Name();
        System.out.println("\nEnter Grade Level: 1, 2, or 3");
        int new_gradeLevel = this.getinput_GradeLevel();
        System.out.println("\nIs "+new_name+" a boy or a girl?"+
                "\nEnter B or G");
        boolean new_male = this.getinput_Gender(new_name);
        Player currentPlayer = new Player();
        currentPlayer.setPlayer(new_name, new_gradeLevel, new_male);
        //Mathlantis.setCurrentPlayer(currentPlayer);
        GameMenuView gameMenu = new GameMenuView();
        QuestionControl theQuestions = new QuestionControl();
        gameMenu.displayMenu(theGameControl, theQuestions);
    }
    private String getinput_Name(){
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value =""; // value to be rturned
       boolean valid = false; // initialize to not valid
       
       while (!valid){// loop while an invalid value is enter
           
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           if(value.length()< 1) {//value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; // end the loop
       }
       System.out.println("\nPlayer name is "+value);
        return value; // return the value entered
}
    private int getinput_GradeLevel(){
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value =""; 
       int grade = 0;
       boolean valid = false; // initialize to not valid
       
       while (!valid){// loop while an invalid value is enter
           
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           
           if(value.equals("1")){
               grade = 1;
               //System.out.println("\nYou entered 1");
               valid = true;
           }
           if(value.equals("2")){
               grade = 2;
               valid = true;
           }
           if(value.equals("3")){
               grade = 3;
               valid = true;
           }
           if(!valid){
           System.out.println("\nInvalid value: enter 1, 2, or 3");
           }
       }
        System.out.println("\nGrade Level is "+value);
        return grade; // return the value entered
    }
    private boolean getinput_Gender(String name){
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value =""; 
       boolean male = false;
       boolean valid = false; // initialize to not valid
       String Gender = "";
       
       while (!valid){// loop while an invalid value is enter
           
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); // trim off leading and trailing blanks
           
           
           if(value.equals("B") || value.equals("b")){
               male = true;
               Gender = "boy";
               valid = true;
           }
           if(value.equals("G") || value.equals("g")){
               male = false;
               Gender = "girl";
               valid = true;
           }
           if(!valid){
           System.out.println("\nInvalid value: enter B or G");
           }
           
       }
       
        System.out.println("\n"+name+" is a "+Gender);
        return male; // return the value entered
    }
public static Player getPlayer() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

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
