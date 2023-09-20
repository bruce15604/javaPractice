package environment;

import static org.junit.Assert.assertNull;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import lifeform.LifeForm;

/**
 * The test cases for the Cell class
 */
public class TestCell {
  /**
   * At initialization, the Cell should be empty and not contain a
   * LifeForm.
   */
  @Test
  public void testInitialization() {
    Cell cell = new Cell();
    assertNull(cell.getLifeForm());
  }
   
  /**
   * Checks to see if we change the LifeForm held by the Cell that
   * getLifeForm properly responds to this change.
   */
  @Test
  public void testAddLifeForm() {
    LifeForm bob = new LifeForm("Bob", 40);
    LifeForm fred = new LifeForm("Fred", 40);
    Cell cell = new Cell();
    // The Cell is empty so this should work.
    boolean success = cell.addLifeForm(bob);
    assertTrue(success);
    assertEquals(bob, cell.getLifeForm());
    // The Cell is not empty so this should fail.
    success = cell.addLifeForm(fred);
    assertFalse(success);
    assertEquals(bob, cell.getLifeForm());
  }
     
  /**
   * Tests that you cannot add lifeform when cell is occupied.
   */
  @Test
  public void testOccupiedCell() {
    Cell cell = new Cell(); //Creates new cell
    //Creates two new lifeforms
    LifeForm entity1 = new LifeForm("Bob", 40);
    LifeForm entity2 = new LifeForm("Alice", 40);
    
    assertTrue(cell.addLifeForm(entity1)); //Adds entity 1
    //Attempts to put Alice in a cell occupied by Bob, which should fail
    boolean success = cell.addLifeForm(entity2);
    assertFalse(success);
    //Ensures Bob is still in the cell
    assertEquals(entity1, cell.getLifeForm());
  }
  
  /**
   * Tests that you can remove a lifeform from a cell
   */
  @Test
  public void testRemoveLifeForm() {
    Cell cell = new Cell();
    LifeForm entity = new LifeForm("Bob", 40);
    //Adds lifeform to cell
    assertTrue(cell.addLifeForm(entity));
    //Removes lifeform from cell
    cell.removeLifeForm();
    //Checks that cell is now empty
    assertNull(cell.getLifeForm());
  }
}
