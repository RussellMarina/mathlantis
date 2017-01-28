/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathlantis;

import byui.cit260.mathlantis.model.Game;
import byui.cit260.mathlantis.model.Map;
import byui.cit260.mathlantis.model.PowerUpTypeScene;
import byui.cit260.mathlantis.model.QuestionTypeScene;
import byui.cit260.mathlantis.model.Questions;
import byui.cit260.mathlantis.model.Scene;

/**
 *
 * @author Marina
 */
public class Mathlantis {
    
    public static void main(String[] args){
        Game gameOne = new Game();
        Map mapOne = new Map();
        Questions questionOne = new Questions();
        Scene sceneOne = new Scene();
        PowerUpTypeScene powerUpTypeSceneOne = new PowerUpTypeScene();
        QuestionTypeScene questionTypeSceneOne = new QuestionTypeScene();
        
        gameOne.setTotalTime(1.00);
        mapOne.setRowCount(5);
        mapOne.setColumnCount(8);
        questionOne.setGrade(1);
        questionOne.setQuestionTime(1);
        questionOne.setUsedPowerUp(10);
        
        String gameInfo = gameOne.toString();
        String mapInfo = mapOne.toString();
        String questionsInfo = questionOne.toString();
        
        System.out.println(gameInfo);
        System.out.println(mapInfo);
        System.out.println(questionsInfo);
        
        sceneOne.setDescription("A Scary Sunken Pirate Ship!");
        sceneOne.setBlockedLocation(Boolean.TRUE);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        powerUpTypeSceneOne.setAmountAvailable(5);
        powerUpTypeSceneOne.setResourceType("Color Gems");
        
        String powerUpTypeSceneInfo = powerUpTypeSceneOne.toString();
        System.out.println(powerUpTypeSceneInfo);
        
        questionTypeSceneOne.setQuestionType("Multiplication");
        
        String questionTypeSceneInfo = questionTypeSceneOne.toString();
        System.out.println(questionTypeSceneInfo);
    }
}
