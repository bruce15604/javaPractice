import java.util.Scanner;

public class DistanceTraveled
{
    public static void main(String[] args)
    {
        /*The distance a vehicle travels can be calculated as follows: Distance = Speed*Time
        For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
        120 miles. Write a program that asks for the speed of a vehicle (in mile-per-hour) and the
        number of hours it has traveled. It should use a loop to display a vehicle has traveled
        for each hour of a time period specified by the user. For example, if a vehicle is traveling at
        40 mph for a three-hour period, it should display a report to the one that follows:
        Hour            Distance Traveled
        ---------------------------------
        1                       40
        2                       80
        3                      120

        Input Validation: Do not accept a negative number for speed and do not accept any value
        less than 1 for time traveled.*/
        //Initialize Scanner and variables
        Scanner keyboard = new Scanner(System.in);
        int speed, time;

        //Prompt user for speed input
        System.out.println("What is the speed of the vehicle in mph? ");
        speed = keyboard.nextInt();
        //Validate input
        while(speed < 0)
        {
            System.out.println("That input is invalid, input a positive integer for speed. ");
        }

        //Prompt user for time input
        System.out.println("How many hours has it traveled? ");
        time = keyboard.nextInt();
        //Validate input
        while(time < 1)
        {
            System.out.println("That input is invalid, input a positive integer greater than 1 for time. ");
        }

        //Template for the report table
        System.out.println("Hour" + "            Distance Traveled");
        System.out.println("---------------------------------");

        //Prints the time, adds a space, and then prints the distance traveled from 1 hr to the time specified by the user
        for(int i = 1; i <= time; i++)
        {
            System.out.println(i + "                       " + i * speed);
        }
    }
}
