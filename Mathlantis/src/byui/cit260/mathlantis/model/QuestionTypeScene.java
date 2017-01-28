/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathlantis.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Stormblade
 */
public class QuestionTypeScene implements Serializable{
    
    private String questionType;

    public QuestionTypeScene() {
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.questionType);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionTypeScene{" + "questionType=" + questionType + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionTypeScene other = (QuestionTypeScene) obj;
        if (!Objects.equals(this.questionType, other.questionType)) {
            return false;
        }
        return true;
    }
    
}
