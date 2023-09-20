package environment;

import lifeform.LifeForm;

/**
 * An environment that holds cells within a 2D array.
 */
public class Environment {
  private int numRows;
  private int numCols;
  private Cell[][] cells;
  
  /**
   * Environment constructor that takes ints for array size.
   * @param rows number of rows made when making new environment
   * @param cols number of cols made when making new environment
   */
  public Environment(int rows, int cols) {
    numRows = rows;
    numCols = cols;
    cells = new Cell[rows][cols];
    //Initializes cells
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        cells[row][col] = new Cell();
      }
    }
  }
  
  /**
   * Returns the lifeform in a specified cell in the environment.
   * @param row row of specified cell
   * @param col col of specified cell
   */
  public LifeForm getLifeForm(int row, int col) {
    if (isValidCell(row, col)) {
      Cell cell = cells[row][col];
      return cell.getLifeForm();
    }
    return null;
  }
  
  /**
   * Adds a lifeform to a cell in the environment.
   * @param entity LifeForm that is attempting to be added to specified cell
   * @param row row of specified cell
   * @param col col of specified cell
   */
  public boolean addLifeForm(LifeForm entity, int row, int col) {
    if (isValidCell(row, col)) {
      Cell cell = cells[row][col];
      cell.addLifeForm(entity);
      return true;
    }
    return false;
  }
  
  /**
   * Removes a lifeform of a cell in the environment.
   * @param row row of specified cell
   * @param col col of specified cell
   */
  public void removeLifeForm(int row, int col) {
    if (isValidCell(row, col)) {
      Cell cell = cells[row][col];
      if (cell != null) {
        cell.removeLifeForm();
      }
    }
  }
  
  /**
   * Checks if given row and col are valid
   * @param row row of cell being checked
   * @param col col of cell being checked
   */
  private boolean isValidCell(int row, int col) {
    return row >= 0 && row < numRows && col >= 0 && col < numCols;
  }
}
