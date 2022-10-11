import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        /*Write a program that asks for a positive nonzero integer value. The program should
        use a loop to get the sum of all the integers from 1 up to the number entered. For example,
        if the user enters 50, the loop will find the sum of 1, 2, 3, 4,...50.*/

        //Initialize Scanner, user input variable "number", and the sum variable.
        System.out.println("Please enter a positive nonzero integer to get the sum of all the integers from 1 up to the number entered. ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int sum = 0;

        //Validate the Input
        while(number < 1)
        {
            System.out.println("That number is invalid, please enter a positive nonzero integer. ");
            number = keyboard.nextInt();
        }

        //Calculate Sum and print
        for(int i = 1; i <= number; i++)
        {
            System.out.print(sum + " + " + i + " = ");
            sum += i;
            System.out.println(sum);
        }
        System.out.println("The total sum is: " + sum);
    }
}
