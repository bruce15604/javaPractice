import java.util.Scanner;

public class AreaTest
{
    public static void main(String[] args)
    {
        //Declare variables and create Scanner object
        final double pi = Math.PI;
        Scanner keyboard = new Scanner(System.in);
        double radius, width, length, cylinderRadius, height, circleArea, rectangleArea, cylinderArea;

        //Prompts the user for the radius of a Circle
        System.out.println("What is the radius of the circle? ");
        System.out.println("Radius: ");
        radius = keyboard.nextDouble();

        //Prompts the user for the width and length of a Rectangle
        System.out.println("What is the width and length of the rectangle? ");
        System.out.println("Width: ");
        width = keyboard.nextDouble();
        System.out.println("Length: ");
        length = keyboard.nextDouble();

        //Prompts the user for the radius and height of a Cylinder
        System.out.println("What is the radius and height of the cylinder? ");
        System.out.println("Radius: ");
        cylinderRadius = keyboard.nextDouble();
        System.out.println("Height: ");
        height = keyboard.nextDouble();

        //Output
        //Sets the calculated areas to a variable to be more organized and to format it
        circleArea = Area.calculate(radius);
        rectangleArea = Area.calculate(width, length);
        cylinderArea = Area.calculate(cylinderRadius, height, pi);

        //Formats and outputs the results rounded to 2 decimal places
        System.out.printf("The circle with the radius of %,.2f has an area of %,.2f%n", radius, circleArea);
        System.out.printf("The rectangle with the width of %,.2f and the length of %,.2f has an area of %,.2f%n"
                            , width, length, rectangleArea);
        System.out.printf("The cylinder with the radius of %,.2f and the height of %,.2f has an area (volume) of %,.2f%n"
                            , radius, height, cylinderArea);
    }
}
