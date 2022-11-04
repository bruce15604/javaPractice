import java.util.Random;

public class Die
{
    private int sides; //number of sides
    private int value; //die's value

    //initial roll of the dice
    public Die(int sides)
    {
        this.sides = sides;
        roll();
    }

    //simulates rolling of a die
    public void roll()
    {
        //Creates new random object
        Random random = new Random();
        //Get a random value for the die
        value = random.nextInt(sides) + 1;
    }

    //returns sides
    public int getSides()
    {
        return sides;
    }
    //returns value
    public int getValue()
    {
        return value;
    }
}
