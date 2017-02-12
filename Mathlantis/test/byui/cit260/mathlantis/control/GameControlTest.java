/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stormblade
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calculateScore method, of class GameControl.
     */
    @Test
    public void testCalculateScore() {
        /*
         * Prototype Test
         */
        System.out.println("calculateScore");
        int powerUpsUsed = 0;
        GameControl instance = new GameControl();
        int expResult = 25;
        int result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        /*
         * Test Case 1
         */
        System.out.println("calculateScore");
        powerUpsUsed = 1;
        
        expResult = 24;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        
        /*
         * Test Case 2
         */
        System.out.println("calculateScore");
        powerUpsUsed = -1;
        
        expResult = -1;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        
        /*
         * Test Case 3
         */
        System.out.println("calculateScore");
        powerUpsUsed = 26;
        
        expResult = -1;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        
        /*
         * Test Case 4
         */
        System.out.println("calculateScore");
        powerUpsUsed = -5;
        
        expResult = -1;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        
        /*
         * Test Case 5
         */
        System.out.println("calculateScore");
        powerUpsUsed = 0;
        
        expResult = 25;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
        
        /*
         * Test Case 6
         */
        System.out.println("calculateScore");
        powerUpsUsed = 25;
        
        expResult = 0;
        result = instance.calculateScore(powerUpsUsed);
        assertEquals(expResult, result);
    }
    
}
