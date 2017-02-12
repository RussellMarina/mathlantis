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
import java.util.Random;

public class QuestionControl {
    
    /**
     * Returns a one dimensional array that represents 
     * a math problem.
     * The array should be 4 integers long
     * [arg1 arg2 answer type]
     * type is the operation:
     * 0=addition
     * 1=subtraction
     * 2=multiplication
     * 3=division
     * 
     * @param gradeLevel, 1, 2, or 3
     * @return a one dimensional array that represents 
     * a math problem.
     * 
     * */
    public int[] generateQuestion(int gradeLevel){
        Random rnd = new Random();
        int equation[]=new int[4];
        if (gradeLevel==1){
            equation[3]=rnd.nextInt(2);  //allow addition or subtraction
            equation[0] = rnd.nextInt(11);  //integer between 0 and 10
            equation[1] = rnd.nextInt(11); //integer between 0 and 10
            if(equation[3]==0){//if type is addition, the answer is the sum of the arguments
            equation[2] = equation[0] + equation [1];
            }
            else{//subtraction
                if(equation[1]>equation[0]){//make sure first argument is greater than second if subtracting
                    equation[2]=equation[1];
                    equation[1]=equation[0];
                    equation[0]=equation[2];
                }
                    
                    equation[2]=equation[0]-equation[1];
            }
            return equation;
        }   
        else if (gradeLevel==2){
            equation[3]= rnd.nextInt(3);//allow addition, subtraction, and multiplication 
            if(equation[3]==2){//multiplication up to 12
            equation[0] = rnd.nextInt(13);
            equation[1] = rnd.nextInt(13);
            equation[2] = equation[1]*equation[0];
            
            }
            else{//addition and subtraction up to 20
               equation[0] = rnd.nextInt(21); //integer between 0 and 20
               equation[1] = rnd.nextInt(21); //integer between 0 and 20
            if(equation[3]==0){//if type is addition, the answer is the sum of the arguments
            equation[2] = equation[0] + equation [1];
            }
            else{//subtraction
                if(equation[1]>equation[0]){//make sure first argument is greater than second if subtracting
                    equation[2]=equation[1];
                    equation[1]=equation[0];
                    equation[0]=equation[2];
                }
                    
                    equation[2]=equation[0]-equation[1];
            } 
            }
            return equation;
        }
        else{  //grade =3
        equation[3]= rnd.nextInt(4);//allow addition, subtraction, multiplication, and division
        if(equation[3]==2){//multiplication up to 12
            equation[0] = rnd.nextInt(13);//random multiplier
            equation[1] = rnd.nextInt(13);//random multiplier
            equation[2] = equation[1]*equation[0];//product is two multipliers multiplied together
            
            }
        else if(equation[3]==3){//division up to 12
            equation[1] = rnd.nextInt(13);//generate random divisor
            equation[2] = rnd.nextInt(13);//generate random quotient
            equation[0] = equation[1]*equation[2];//divident is divisor times quotient
        }
        else{//addition and subtraction
               equation[0] = rnd.nextInt(21); //integer between 0 and 20
               equation[1] = rnd.nextInt(21); //integer between 0 and 20
            if(equation[3]==0){//if type is addition, the answer is the sum of the arguments
            equation[2] = equation[0] + equation [1];
            }
            else{//subtraction
                if(equation[1]>equation[0]){//switch arguments if second is greater than first
                    equation[2]=equation[1];
                    equation[1]=equation[0];
                    equation[0]=equation[2];
                }
                    
                    equation[2]=equation[0]-equation[1];
            } 
            }
        return equation;
        }
    }

    /* @param String answer: the answer input by the user
     * @param int Correct: The correct answer
     * @return byte check 0: correct answer
                   1: the answer is incorrect
                   2: error, the supplied answer is not within the correct bounds
    */
 public int submitAnswer(String answer, int correct)
{
    byte check = 0;
    int submitted = 0;
    boolean badFormat = false;
    try {
        submitted = Integer.parseInt(answer);
        
    } catch (NumberFormatException e) {
        submitted = -1;
        badFormat = true;
        System.out.println("Answer is invalid: please try again.  Answer cannot be longer than 3 characters and may not contain letters or special characters");
        check = 2;//answer out of bounds.  Perhaps not a number
        return check;
    }
    
	if ((submitted < 0)||(submitted>999)){
		System.out.println("Answer is invalid: please try again.  Answer cannot be longer than 3 characters and may not be negative");
		check = 1;//answer out of bounds, is a number, but too high or too low
            return check;
        }
	if (submitted == correct){
            check = 0;//right answer
            return check;
        }
        else{
            check = 1;//wrong answer but inbounds
            return check;
        }
}
   
    
    
}

