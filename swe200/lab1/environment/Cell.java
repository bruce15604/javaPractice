package environment;

import lifeform.LifeForm;

/**
 * A Cell that can hold a LifeForm.
 */
public class Cell {
  
  private LifeForm currentLifeForm; //Instance variable to store the lifeform
  
  /**
   * @return the LifeForm in this Cell.
   */
  public LifeForm getLifeForm() {
    return currentLifeForm;
  }
     
  /**
   * Tries to add the LifeForm to the Cell. Will not add if a
   * LifeForm is already present.
   * @param entity the life form held in the cell
   * @return true if the LifeForm was added to the Cell, false otherwise.
   */
  public boolean addLifeForm(LifeForm entity) {
    if (currentLifeForm == null) {
      currentLifeForm = entity;
      return true;
    }
    return false;
  }
      
  /**
   * Remove the LifeForm from the cell if it exists.
   */
  public void removeLifeForm() {
    currentLifeForm = null;
  }
}
