/* Write a program that asks the user to enter a distance in meters. The program will then
present the following menu of selections:
1.Convert to kilometers
2.Convert to inches
3.Convert to feet
4.Quit the program

The program will convert the distance to what the user chooses, you need:
- a void method named showKilometers, which accepts meters as an arg and displays the arg converted to km
using the formula "kilometers = meters * 0.001"

- a void method named showInches, which accepts meters as an arg and displays the arg converted to inches
using the formula "inches = meters * 39.37"

- a void method named showFeet, which accepts meters as an arg and displays the arg converted to feet
using the formula "feet = meters * 3.281"

- a void method named menu that displays the menu of selections. This method should not accept any args.

The program should continue to display the menu until the user enters 4 to quit the program, if the user
enters an invalid choice from the menu the program should display an error message.
 */
import java.util.Scanner;
public class ConversionProgram
{
    public static void main(String[] args)
    {
        //Initialize variables and scanner object
        double distance;
        int sentinelValue = 0, input;
        Scanner keyboard = new Scanner(System.in);

        //prompts user for a distance in meters for conversion
        System.out.println("Enter a distance in meters: ");
        distance = keyboard.nextDouble();

        //verifies distance input is not a negative value
        while (distance < 0)
        {
            System.out.println("Please enter a distance that is greater than zero: ");
            distance = keyboard.nextDouble();
        }

        //As long as the user does not quit program, it will loop and continue to convert
        do
        {
            menu(); //opens menu
            input = keyboard.nextInt(); //takes user selection

            if(input == 1)
            {
                showKilometers(distance); //converts to km
            }
            else if(input == 2)
            {
                showInches(distance); //converts to in
            }
            else if(input == 3)
            {
                showFeet(distance); //converts to ft
            }
            else if(input == 4)
            {
                System.out.println("Bye!"); //Ends the menu and program
                sentinelValue = -99;
            }
            else
            {
                System.out.println("Enter one of the menu numbers");
            }
        }
        while(sentinelValue != -99);
    }

    //menu method simply displays the menu
    public static void menu()
    {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    //showKilometers method converts inputted meters into km
    public static void showKilometers(double distance)
    {
        double kilometers;
        kilometers = distance * 0.001;
        System.out.printf("%,.2f meters is %,.2f kilometers%n%n", distance, kilometers);
    }

    //showInches method converts inputted meters into in
    public static void showInches(double distance)
    {
        double inches;
        inches = distance * 39.37;
        System.out.printf("%,.2f meters is %,.2f inches%n%n", distance, inches);
    }

    //showFeet method converts inputted meters into ft
    public static void showFeet(double distance)
    {
        double feet;
        feet = distance * 3.281;
        System.out.printf("%,.2f meters is %,.2f feet%n%n", distance, feet);
    }
}
