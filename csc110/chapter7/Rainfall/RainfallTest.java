import java.util.Scanner;

public class RainfallTest
{
    public static void main(String[] args)
    {
        //Initiates array and Scanner objects
        Scanner keyboard = new Scanner(System.in);
        double[] rain = new double[12];

        System.out.println("Please enter the monthly rainfall ");
        for(int i = 0; i < rain.length; i++) //For every element of the array, asks the user to assign a value to it
        {
            System.out.println("Month "+(i + 1)+": ");
            double input = keyboard.nextDouble();
            if(input >= 0) //Makes sure that there are no negative numbers for monthly rainfall
            {
                rain[i] = input;
            }
            else
            {
                while(input < 0)
                {
                    System.out.println("There cannot be a negative number for rainfall");
                    System.out.println("Month "+(i + 1)+": ");
                    input = keyboard.nextDouble();
                }
                rain[i] = input;
            }
        }
        double total = Rainfall.totalRain(rain);
        double average = Rainfall.averageRain(rain);
        double most = Rainfall.mostRain(rain);
        double least = Rainfall.leastRain(rain);

        //Outputs info
        System.out.format("Total rainfall: %,.2f%n", total);
        System.out.format("Average rainfall: %,.2f%n", average);
        System.out.format("Most rainfall: %,.2f%n", most);
        System.out.format("Least rainfall: %,.2f%n", least);
    }
}
