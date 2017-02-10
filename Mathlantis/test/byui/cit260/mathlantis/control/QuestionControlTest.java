/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.control;

import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Marina
 */
public class QuestionControlTest {
    
    public QuestionControlTest() {
    }

    /**
     * Test of generateQuestion method, of class QuestionControl.
     */
    @Test
    public void testGenerateQuestion() {
        System.out.println("generateQuestion");
        /***************************
         * Test case #1
         */
        System.out.println("\tTest case #1");
        
        // input the values for the test case 1
        int gradeLevel = 3;
        //int[] expResult = null; // expected output returned value
        
        // create instance of QuestionControl class
        QuestionControl instance = new QuestionControl();
        
        
        // call function to run test
        int[] result = instance.generateQuestion(gradeLevel);
        
        //compare expected return value with actual value returned
       // assertArrayEquals(expResult, result);
       for (int i = 0; i < result.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(result[i]);
       }
        
    }
    
}
