
package mathlantis;


import byui.cit260.mathlantis.model.Game;
import byui.cit260.mathlantis.model.Player;
import byui.cit260.mathlantis.view.StartProgramView;

/**
 *
 * @author Marina
 */
public class Mathlantis {
    private static Game currentGame = null;
    private static Player currentPlayer = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game new_currentGame) {
       Mathlantis.currentGame = new_currentGame;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player new_currentPlayer) {
        currentPlayer = new_currentPlayer;
    }
    
    public static void main(String[] args){
        
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
