import java.util.Random;
import java.util.Scanner;

public class ESPGame
{
    public static void main(String[] args)
    {
        /*Write a program that tests your ESP (extrasensory perception). The program should randomly
        select the name of a color from the following list of words:
        Red, Green, Blue, Orange, Yellow
        To select a word, the program can generate a random number. For example, if the number
        is 0, the selected word is Red, if the number is 1, the selected word is Green, and so forth.
        Next, the program should ask the user to enter the color that the computer has selected. After
        the user has entered his or her guess, the program should display the name of the randomly
        selected color. The program should repeat this 10 times and then display the number of times
        the user correctly guess the selected color.*/

        //Create scanner, variables, and random
        Scanner keyboard = new Scanner(System.in);
        int correctGuess = 0, incorrectGuess = 0, total = 0, color, userColor = -1;
        Random randomValue = new Random();

        //Program instructions
        System.out.println("The program will randomly choose a color: Red, Green, Blue, Orange or Yellow.");
        System.out.println("You must try to guess the color, the program will output how many you guess correctly.");

        while(total < 10)
        {
            color = randomValue.nextInt(4);
            String userColorString = keyboard.nextLine();

            //Defines user strings to number equivalents, 0-Red, 1-Green, 2-Blue, 3-Orange, 4-Yellow
            if(userColorString.equalsIgnoreCase("red"))
            {
                userColor = 0;
            }
            else if(userColorString.equalsIgnoreCase("green"))
            {
                userColor = 1;
            }
            else if(userColorString.equalsIgnoreCase("blue"))
            {
                userColor = 2;
            }
            else if(userColorString.equalsIgnoreCase("orange"))
            {
                userColor = 3;
            }
            else if(userColorString.equalsIgnoreCase("yellow"))
            {
                userColor = 4;
            }

            //Checks if the user's guess matches the random one chosen
            if (userColor == color)
            {
                correctGuess ++;
                System.out.println("Good guess! ");
            }
            else
            {
                System.out.println("Sorry, that wasn't correct. ");
                incorrectGuess ++;
            }

            //Ends after 10 tries
            total = correctGuess + incorrectGuess;
        }

        //Returns results
        System.out.println("That was 10 times! You guessed " + correctGuess + "/10 correct!");
    }
}
