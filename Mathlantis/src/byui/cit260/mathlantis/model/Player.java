/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.model;

/**
 *
 * @author Marina
 */
public class Player  {
    int gradeLevel;
    String name;
    boolean male;
    
    public void setPlayer(String new_name, int new_gradeLevel, boolean new_male){
        this.setGradeLevel(new_gradeLevel);
        this.setGender(new_male);
        this.setName(new_name);
    }
    private void setGradeLevel(int new_gradeLevel){
        gradeLevel = new_gradeLevel;
    }
    private void setGender(boolean new_male){
        male = new_male;
    }
    private void setName(String new_name){
        name = new_name;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }
    public boolean getGender(){
        return male;
    }
    public String getName(){
        return name;
    }
}
