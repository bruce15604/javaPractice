import java.util.Scanner;

public class LargestAndSmallest
{
    public static void main(String[] args)
    {
        /*Write a program with a loop that lets the user enter a series of integers. The user should enter
        -99 to signal the end of the series. After all the numbers have been entered, the program
        should display the largest and smallest numbers entered. */

        //Create scanner and variables for smallest and largest numbers and for user input
        Scanner keyboard = new Scanner(System.in);
        int userValue, smallest, largest = 0;

        //Program instructions and initial user input.
        System.out.println("Please enter an integer value, the system will continue to prompt for a value until you enter -99");
        System.out.print("Enter an integer: ");
        userValue = keyboard.nextInt();

        //Set the first value as the smallest initially
        smallest = userValue;

        //Tests for numbers being larger or smaller until the user enters the sentinel value
        while(userValue != -99)
        {
            System.out.print("Enter an integer: ");
            userValue = keyboard.nextInt();
            if(userValue != -99)
            {
                if(userValue > smallest)
                {
                    largest = userValue;
                }
                else
                {
                    smallest = userValue;
                }
            }
        }

        //Outputs final results
        System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
    }
}
