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

    /**
     * Test of submitAnswer method, of class QuestionControl.
     */
    @Test
    public void testSubmitAnswer() {
        
        System.out.println("submitAnswer");
        
        //test case #1
        String answer = "101";
        int correct = 101;
        QuestionControl instance = new QuestionControl();
        int expResult = 0;
        int result = instance.submitAnswer(answer, correct);
        assertEquals(expResult, result);
        
        
        //test case #2
        answer = "Hello";
        correct = 15;
        //QuestionControl instance = new QuestionControl();
        expResult = 2;
        result = instance.submitAnswer(answer, correct);
        assertEquals(expResult, result);
        
        //test case #3
        answer = "-250";
        correct = 12;
        //QuestionControl instance = new QuestionControl();
        expResult = 1;
        result = instance.submitAnswer(answer, correct);
        assertEquals(expResult, result);
        
        //test case #4
        answer = "13";
        correct = 12;
        //QuestionControl instance = new QuestionControl();
        expResult = 1;
        result = instance.submitAnswer(answer, correct);
        assertEquals(expResult, result);
        
        //test case #5
        answer = "10435";
        correct = 12;
        //QuestionControl instance = new QuestionControl();
        expResult = 1;
        result = instance.submitAnswer(answer, correct);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
