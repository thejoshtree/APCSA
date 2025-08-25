/**
 * Algo.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */ 

import kareltherobot.*;
public class Algo implements Directions
{
    public static void main (String [] args)
    {
    // create and exercise robots here.
        UrRobot sam = new UrRobot(6, 7, East, 0);
        sam.turnLeft();
        sam.turnLeft();
        sam.move();
        sam.move();

    
    }

    static
    { 
        World.readWorld("algo.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);
    }

}
