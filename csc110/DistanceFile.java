import java.io.*;
import java.util.Scanner;

public class DistanceFile
{
    public static void main(String[] args) throws IOException
    {
        /*Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it writes
        the report to a file instead of the screen. Open the file in Notepad or another text editor to
        confirm the output.*/

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

        //Create PrintWriter object
        PrintWriter report = new PrintWriter("DistanceReport.txt");

        //Template for the report table
        report.println("Hour" + "            Distance Traveled");
        report.println("---------------------------------");

        //Prints the time, adds a space, and then prints the distance traveled from 1 hr to the time specified by the user
        for(int i = 1; i <= time; i++)
        {
            report.println(i + "                       " + i * speed);
        }
        //Close file
        report.close();
    }
}
