import kareltherobot.*;
import java.awt.Color;

/**
 * BetterRobot.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */
public class BetterRobot extends Robot
{
    private int numBeepers;
    public BetterRobot()
    {
        super(0, 0, East, 0);
        numBeepers = 0;
    }

    public BetterRobot(int street, int avenue)
    {
        super(street, avenue, East, 0);
        numBeepers = 0;
    }

    public BetterRobot(int street, int avenue, Direction dir)
    {
        super(street, avenue, dir, 0);
        numBeepers = 0;
    }

    public BetterRobot(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
        numBeepers = beepers;
    }

    public BetterRobot(int street, int avenue, Direction dir, int beepers, Color color)
    {
        super(street, avenue, dir, beepers, color);
        numBeepers = beepers;
    }

    public void putBeeper()
    {
        if (anyBeepersInBeeperBag())
        {
            numBeepers--;
        }
        super.putBeeper();
    }

    public void pickBeeper()
    {
        if (nextToABeeper())
        {
            numBeepers++;
        }
        super.pickBeeper();
    }

    public int beeperCount()
    {
        return numBeepers;
    }

    public void move(int numMoves)
    {
        for (int i = 1; i <= numMoves; i++)
            move();
    }

    public void turnRight()
    {
        turnAround();
        turnLeft();
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
}