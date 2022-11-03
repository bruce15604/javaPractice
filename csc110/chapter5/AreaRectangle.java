/*
   You must complete this program so that it calculates
   and displays the area of a rectangle.
*/

import java.util.Scanner;

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length, width, area;

      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }

   /* getLength() method asks the user for the length of a chosen rectangle
   * and returns that double value */
   public static double getLength()
   {
      //User Inquiry and new Scanner object
      System.out.println("What is the length of the rectangle?");
      Scanner keyboard = new Scanner(System.in);

      double length = keyboard.nextDouble(); //Gets user input

      //Returns length value
      return length;
   }
   /* getWidth() method asks the user for the width of a chosen rectangle
   * and returns it as a double value */
   public static double getWidth()
   {
      //User Inquiry and new Scanner object
      System.out.println("What is the width of the rectangle?");
      Scanner keyboard = new Scanner(System.in);

      double width = keyboard.nextDouble(); //Gets user input

      // Returns width value
      return width;
   }
   /* getArea() method takes the two dimensions and multiplies them
   * and returns the area back as a double */
   public static double getArea(double length, double width)
   {
      double area = length * width;
      return area;
   }
   /* displayData() method takes the dimensions and the area and
   * outputs them to the user */
   public static void displayData(double length, double width, double area)
   {
      System.out.println("The length is: " + length);
      System.out.println("The width is: " + width);
      System.out.println("The area is: " + area);
   }
}

