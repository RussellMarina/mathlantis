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
public class PowerUpTypeScene implements Serializable{
    
    private int amountAvailable;
    private String resourceType;

    public PowerUpTypeScene() {
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.amountAvailable;
        hash = 59 * hash + Objects.hashCode(this.resourceType);
        return hash;
    }

    @Override
    public String toString() {
        return "PowerUpTypeScene{" + "amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + '}';
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
        final PowerUpTypeScene other = (PowerUpTypeScene) obj;
        if (this.amountAvailable != other.amountAvailable) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    } 
    
}
