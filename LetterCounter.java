import java.util.Scanner;

public class LetterCounter
{
    public static void main(String[] args)
    {
        /*Write a program that asks the user to enter a string, and then asks the user to enter a character.
        The program should count and display the number of times that the specified character
        appears in the string.*/

        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Declare variables for user inputted string and character
        String text;
        char letter;

        //String and character input prompts
        System.out.println("Enter a string: ");
        text = keyboard.nextLine();
        System.out.println("Enter a character: ");
        letter = keyboard.nextLine().charAt(0);

        //Counts for the character
        int count = 0;
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == letter)
            {
                count++;
            }
        }
        //Displays amount of times it appears
        System.out.println("That character appears " + count + " times. ");
    }
}
