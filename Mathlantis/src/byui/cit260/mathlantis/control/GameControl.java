/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.control;

/**
 *
 * @author Marina
 */
public class GameControl {
    
    public static void createNewGame(Player player){
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
    public int calculateScore(int powerUpsUsed) {
    
        if (powerUpsUsed < 0 || powerUpsUsed > 25) {
            return -1;
        }
        
        // highest score possible is 25.  Subtract number of power ups used 
        // in order to get the final score.
        int finalScore = 25 - powerUpsUsed;
        
        return finalScore;
    }
    
}
