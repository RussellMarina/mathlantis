/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.control;

import byui.cit260.mathlantis.model.Player;
import mathlantis.Mathlantis;

/**
 *
 * @author Marina
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
                    if (playersName == null){
                        return null;
                    }
                    Player player = new Player();
                    player.setPlayer(playersName, 1, true );
                    Mathlantis.setCurrentPlayer(player); //save the player
                    return player;
                    
                    
             
    }
    Player currentPlayer;
    public void createNewGame(Player new_player){
        currentPlayer = new_player;
        //System.out.println("\n*** createNewGame stub function called ***");
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
