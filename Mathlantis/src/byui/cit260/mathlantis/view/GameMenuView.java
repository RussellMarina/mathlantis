/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.view;
import byui.cit260.mathlantis.control.GameControl;
import byui.cit260.mathlantis.model.Questions;
import byui.cit260.mathlantis.control.QuestionControl;
import java.util.Scanner;
import mathlantis.Mathlantis;

/**
 *
 * @author Marina
 */
public class GameMenuView {

    void displayMenu(GameControl theGameControl, QuestionControl theQuestions) {
       System.out.println("Welcome to the first underwater location."
               + "\n Here you must solve math problems to advance."
               + "Occasionally, you will receive bonus items that will"
               + "help you on your journey.");
       boolean playing = true;
       while (playing){
           int[] currentQuestion = theQuestions.generateQuestion(Mathlantis.getCurrentPlayer().getGradeLevel());
           String operator = "+";
           
           switch(currentQuestion[3]){
               case 0: operator = "+";
               break;
               case 1: operator = "-";
               break;
               case 2: operator = "*";
               break;
               case 3: operator = "/";
               break;
               default: break;
           }
           String arg1 = Integer.toString(currentQuestion[0]);
           String arg2 = Integer.toString(currentQuestion[1]);
           System.out.println("*************************"
                   + "\n Input the answer and press enter"
                   + "\n"+arg1+" "+operator+" "+arg2+" = __");
           String answer = getinput_Answer();
           int check = theQuestions.submitAnswer(answer, currentQuestion[2]);
           if(check>0){
               System.out.println("\nIncorrect");
           }
           if(check == 0){
               System.out.println("\nCorrect");
           }
           
       }
    }
    private String getinput_Answer(){
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
       
       
        return value; // return the value entered
}
}
