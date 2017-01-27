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
public class Questions {
    private double grade;
    private double questionTime;
    private double usedPowerUp;

    public Questions() {
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(double questionTime) {
        this.questionTime = questionTime;
    }

    public double getUsedPowerUp() {
        return usedPowerUp;
    }

    public void setUsedPowerUp(double usedPowerUp) {
        this.usedPowerUp = usedPowerUp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.grade) ^ (Double.doubleToLongBits(this.grade) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.questionTime) ^ (Double.doubleToLongBits(this.questionTime) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.usedPowerUp) ^ (Double.doubleToLongBits(this.usedPowerUp) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Questions{" + "grade=" + grade + ", questionTime=" + questionTime + ", usedPowerUp=" + usedPowerUp + '}';
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
        final Questions other = (Questions) obj;
        if (Double.doubleToLongBits(this.grade) != Double.doubleToLongBits(other.grade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.questionTime) != Double.doubleToLongBits(other.questionTime)) {
            return false;
        }
        return Double.doubleToLongBits(this.usedPowerUp) == Double.doubleToLongBits(other.usedPowerUp);
    }
       
    
    
       
}
