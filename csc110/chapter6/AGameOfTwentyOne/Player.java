public class Player
{
    //sets fields
    private int die1Value, die2Value, totalDieValue;

    //Constructor to set defaults for object
    public Player()
    {
        die1Value = 0;
        die2Value = 0;
        totalDieValue = 0;
    }

    //Rolls dice and gets total
    public void rollDice()
    {
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        die1.roll();
        die2.roll();

        die1Value = die1.getValue();
        die2Value = die2.getValue();
        totalDieValue += die1Value + die2Value;
    }

    //Returns total
    public int getTotalDieValue()
    {
        return totalDieValue;
    }

    //returns first die total
    public int getDie1Value()
    {
        return die1Value;
    }

    //returns second die total
    public int getDie2Value()
    {
        return die2Value;
    }


}
