import java.util.Scanner;

/*For this assignment, you will write a program that lets the user play against the computer in
a variation of the popular blackjack card game. In this variation of the game, two six-sided
dice are used instead of cards. The dice are rolled, and the player tries to beat the computer's
hidden total without going over 21.

Here are some suggestions:
- Each round of the game is performed as an iteration of a loop that repeats as long as
the player agrees to roll the dice, and the player's total does not exceed 21.
- At the beginning of each round, the program will ask the user whether they want to roll
- The loop keeps a running total of both the computer's and the user's points.
- The computer's total should remain hidden until the loop has finished.
- After the loop has finished, the computer's total is revealed, and the player with the
most points, without going over 21, wins.
 */
public class AGameOfTwentyOne
{
    public static void main(String[] args)
    {
        //Create scanner and replay char
        Scanner keyboard = new Scanner(System.in);
        char replay = 'y';
        //Create players
        Player player = new Player();
        Player computer = new Player();
        //Game loop
        do{
            //Computer roll
            System.out.println("The computer rolls");
            computer.rollDice();
            //Player roll
            System.out.println("You roll");
            player.rollDice();
            System.out.println("You rolled " + player.getDie1Value() + " and " + player.getDie2Value());
            if(player.getTotalDieValue() > 21) //Checks if user is over 21
            {
                System.out.println("You went over 21!");
                break;
            }

            System.out.println("Your total is " + player.getTotalDieValue());
            System.out.println("Roll again? "); //Asks if user wants to roll again
            replay = keyboard.nextLine().charAt(0);
        }while(replay == 'y'); //Continues as long as the user doesn't break 21 and they still want to roll

        //Sets winning conditions, making sure that computer wins if user busts and vice versa.
        if(player.getTotalDieValue() > computer.getTotalDieValue() && player.getTotalDieValue() <= 21)
        {
            System.out.println("You won with a total of " + player.getTotalDieValue() +
                                " , the computer had " + computer.getTotalDieValue());
        }
        else if (computer.getTotalDieValue() > player.getTotalDieValue() && computer.getTotalDieValue() <= 21)
        {
            System.out.println("The computer won with a total of " + computer.getTotalDieValue() +
                                " , you had " + player.getTotalDieValue());
        }
        else if (computer.getTotalDieValue() <= 21 && player.getTotalDieValue() > 21)
        {
            System.out.println("The computer won with a total of " + computer.getTotalDieValue() +
                    " , you had " + player.getTotalDieValue());
        }
        else if (player.getTotalDieValue() <= 21 && computer.getTotalDieValue() > 21)
        {
            System.out.println("You won with a total of " + player.getTotalDieValue() +
                    " , the computer had " + computer.getTotalDieValue());
        }
        else if (player.getTotalDieValue() == computer.getTotalDieValue())
        {
            System.out.println("It was a tie! The computer got " + computer.getTotalDieValue() +
                    " , and you had " + player.getTotalDieValue());
        }
    }
}
