package main;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 10/7/13
 * To change this template use File | Settings | File Templates.
 */

import model.PinballBoard;
import java.util.Random;

public class PinballSimulator
{
    public static void main(String[] args)
    {
        final int numberOfRuns = 100;

        PinballBoard results = runPinballGame(numberOfRuns);

        System.out.println("Pinball Game Results ...\n"+results.toString());

    }

    public static PinballBoard runPinballGame(int numberOfRuns)
    {
        PinballBoard pinBoard = new PinballBoard();

        final int t1Chance = pinBoard.getTarget1().getChanceOfLanding();
        final int t2Chance = pinBoard.getTarget2().getChanceOfLanding();

        Random randomSelector = new Random();

        for(int i=1; i<=numberOfRuns;i++)
        {
            //Pick a random number between 0-99
            final int pick = randomSelector.nextInt(100);

            //If T1's chance is 30, and pick is between 0-29. Then T1 wins
            if(pick>=0 && pick<t1Chance)
            {
                pinBoard.getTarget1().incrementNumberOfLandings();
            }
            else
            //If T2's chance is 45, and pick is between 30-74. Then T2 wins
            if(pick>=t1Chance && pick<(t1Chance+t2Chance))
            {
                pinBoard.getTarget2().incrementNumberOfLandings();
            }
            else
            //If T3's chance is 25, and pick is between 75-99, Then T3 wins
            if( (pick>=(t2Chance+t1Chance)) && pick<100)
            {
                pinBoard.getTarget3().incrementNumberOfLandings();
            }
        }

        return pinBoard;
    }
}
