import java.util.Scanner;

public class PenniesForPay
{
    public static void main(String[] args)
    {
        /*Write a program that calculates the amount a person would earn over a period of time if
        his or her salary is one penny the first day, two pennies the second day, and continues to
        double each day. The program should display a table showing the salary for each day, and
        then show the total pay at the end of the period. The output should be displayed in a dollar
        amount, not the number of pennies.

        Input Validation: Do not accept a number less than 1 for the number of days worked.*/

        double salary = 0.01, totalSalary= 0.01;
        //Initialize scanner and prompt user for days worked input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days did you work? ");
        int numDays = keyboard.nextInt();
        //Validate Input
        while(numDays < 1)
        {
            System.out.println("That number is invalid, please enter a positive integer greater than 1 ");
            numDays = keyboard.nextInt();
        }

        //Table header
        System.out.println("Day" + "     Salary     " + "Total Salary");
        System.out.println("-------------------------------");

        //Doubles salary, adds to total salary, and formats into a table for number of days specified by the user
        for(int day = 1; numDays > 0; day++, numDays--)
        {
            System.out.format("%-2d" + "       " + "$%.2f" + "       " + "$%.2f%n", day, salary, totalSalary);
            salary *= 2;
            totalSalary += salary;
        }
    }
}
