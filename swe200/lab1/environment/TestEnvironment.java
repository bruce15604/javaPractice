package environment;

import static org.junit.Assert.assertNull;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import lifeform.LifeForm;

/**
 * The test cases for the Environment class
 */
public class TestEnvironment {
  
  /**
   * Tests creation of single cell environment and checks if cell exists and is empty
   */
  @Test
  public void testInitialization() {
    Environment environment = new Environment(1, 1); //Creates single cell environment
    assertNull(environment.getLifeForm(0, 0));
  }
  
  /**
   * Creates an environment with 2 rows and 3 columns, adds a LifeForm, and checks if present
   */
  @Test
  public void testAddLifeForm() {
    Environment environment = new Environment(2, 3); //Creates 2 row 3 column environment
    LifeForm entity = new LifeForm("Bob", 40); //Creates new LifeForm
    
    assertTrue(environment.addLifeForm(entity, 1, 2)); //Adds lifeform to row 1 column 2
    //Checks that lifeform was added and that it is the same lifeform as entity
    assertEquals(entity, environment.getLifeForm(1, 2)); 
  }
  
  /**
   * Tests placing a LifeForm outside boundaries
   */
  @Test
  public void testBoundary1() {
    Environment environment = new Environment(2, 2); //Creates 2x2 array
    LifeForm entity = new LifeForm("Bob", 40); //Creates lifeform
    
    assertFalse(environment.addLifeForm(entity, 2, 2)); //row 2 col 2 does not exist in a 2x2 array
    assertNull(environment.getLifeForm(2, 2));  //Lifeform should not be stored
  }
  
  /**
   * Tests placing a LifeForm outside boundaries
   */
  @Test
  public void testBoundary2() {
    Environment environment = new Environment(2, 2); //Creates 2x2 environment
    LifeForm entity = new LifeForm("Bob", 40); //Creates lifeform
    
    assertFalse(environment.addLifeForm(entity, -1, -1)); //row -1 col -1 does not exist
    assertNull(environment.getLifeForm(-1, -1));  //Lifeform should not be stored
  }
  
  /**
   * Tests removing a lifeform from environment.
   */
  @Test
  public void testRemoveLifeForm() {
    Environment environment = new Environment(2, 2); //Creates 2x2 environment
    LifeForm entity = new LifeForm("Bob", 40); //Creates lifeform
    
    //Places lifeform in valid cell 
    assertTrue(environment.addLifeForm(entity, 0, 1));
    assertEquals(entity, environment.getLifeForm(0, 1)); 
    //Removes lifeform from cell and verifies that it is gone
    environment.removeLifeForm(0, 1);
    assertNull(environment.getLifeForm(0,1));
  }

}
