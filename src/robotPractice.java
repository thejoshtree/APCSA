import kareltherobot.*;

import static kareltherobot.Directions.East;

public class robotPractice {

    public static void main(String[] args)
    {
        UrRobot sam = new UrRobot(6, 7, East, 8);


    }

    static
    {
        World.readWorld("algo.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);
    }



}
