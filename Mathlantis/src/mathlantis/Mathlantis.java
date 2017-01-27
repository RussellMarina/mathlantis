/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathlantis;

import byui.cit260.mathlantis.model.Game;

/**
 *
 * @author Marina
 */
public class Mathlantis {
    
    public static void main(String[] args){
        Game gameOne = new Game();
                
        gameOne.setTotalTime(1.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
}
