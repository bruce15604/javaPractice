/*Write a Rainfall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:
-The total rainfall for the year
-The average monthly rainfall
-The month with the most rain
-The month with the least rain
Demonstrate the class in a complete program.
Input Validation: Do not accept negative numbers for monthly rainfall figures.
 */
public class Rainfall
{
    public static double totalRain(double[] rain) //Returns total rainfall
    {
        double total = 0; //initiates total variable
        for(int i = 0; i < rain.length; i++) //for each element in the array, add it to the total
        {
            total += rain[i];
        }
        return total;
    }

    public static double averageRain(double[] rain) //Returns the average rainfall
    {
        double average = 0; //initiates average variable
        average = totalRain(rain)/rain.length; //uses the totalRain method and divides it by the length of the array (12)
        return average;
    }

    public static double mostRain(double[] rain) //Returns the amount of rain that the month with the most rain had
    {
        double most = rain[0]; //Assumes that the first element is the greatest
        for(int i = 0; i < rain.length; i++) //For each element, test if it is bigger than the current most
        {
            if(rain[i] > most)
            {
                most = rain[i];
            }
        }
        return most;
    }

    public static double leastRain(double[] rain) //Returns the amount of rain that the month with the least rain had
    {
        double least = rain[0]; //Assums that the first element is the least
        for(int i = 0; i < rain.length; i++) //For each element, test if it is smaller than the current least
        {
            if(rain[i] < least)
            {
                least = rain[i];
            }
        }
        return least;
    }
}
