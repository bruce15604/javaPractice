import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        //Creates scanner and variables
        Scanner keyboard = new Scanner(System.in);
        double radius1, radius2, area1, area2, diameter1, diameter2, circumference1, circumference2;

        //Shows that one constructor takes args and the other doesn't
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle();

        //Prompts user for radius
        System.out.println("Enter the radius: ");
        circle2.setRadius(keyboard.nextDouble());

        //sets variables to methods to format in output
        radius1 = circle1.getRadius();
        radius2 = circle2.getRadius();
        area1 = circle1.area();
        area2 = circle2.area();
        diameter1 = circle1.diameter();
        diameter2 = circle2.diameter();
        circumference1 = circle1.circumference();
        circumference2 = circle2.circumference();

        //Outputs data
        System.out.printf("The first circle, with a radius of %,.2f, " +
                            "has an area of %,.2f, a diameter of %,.2f, " +
                            "and a circumference of %,.2f%n", radius1, area1, diameter1, circumference1);
        System.out.printf("The second circle, with a radius of %,.2f, " +
                            "has an area of %,.2f, a diameter of %,.2f, " +
                            "and a circumference of %,.2f%n", radius2, area2, diameter2, circumference2);
    }
}
