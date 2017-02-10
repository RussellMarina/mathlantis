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
     * Returns a one dimentional array that represents 
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
     * @return a one dimentional array that represents 
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

}

