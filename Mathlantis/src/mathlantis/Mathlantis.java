
package mathlantis;

import byui.cit260.mathlantis.model.Game;
import byui.cit260.mathlantis.model.Location;
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
        Location locationOne = new Location();
        
        
        gameOne.setTotalTime(1.00);
        mapOne.setRowCount(5);
        mapOne.setColumnCount(8);
        questionOne.setGrade(1);
        questionOne.setQuestionTime(1);
        questionOne.setUsedPowerUp(10);
        sceneOne.setDescription("A Scary Sunken Pirate Ship!");
        sceneOne.setBlockedLocation(Boolean.TRUE);
        powerUpTypeSceneOne.setAmountAvailable(5);
        powerUpTypeSceneOne.setResourceType("Color Gems");
        questionTypeSceneOne.setQuestionType("Multiplication");
        locationOne.setRow(1);
        locationOne.setColumn(2);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(3);

        String gameInfo = gameOne.toString();
        String mapInfo = mapOne.toString();
        String questionsInfo = questionOne.toString();
        String sceneInfo = sceneOne.toString();
        String powerUpTypeSceneInfo = powerUpTypeSceneOne.toString();
        String questionTypeSceneInfo = questionTypeSceneOne.toString();
        String locationInfo = locationOne.toString();
        
        System.out.println(gameInfo);
        System.out.println(mapInfo);
        System.out.println(questionsInfo);
        System.out.println(sceneInfo);
        System.out.println(powerUpTypeSceneInfo);
        System.out.println(questionTypeSceneInfo);
        System.out.println(locationInfo);
    
    }
}
