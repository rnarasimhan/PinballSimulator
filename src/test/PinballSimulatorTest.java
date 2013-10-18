package test;

import org.junit.Test;

import model.PinballBoard;
import main.PinballSimulator;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 10/7/13
 * To change this template use File | Settings | File Templates.
 */

public class PinballSimulatorTest
{
         @Test
         public void pinballBoardSetupTest()
         {
             PinballBoard test = new PinballBoard();

             //Make sure the sum of probabilities of three targets = 100
             assertEquals(100, test.getTarget1().getChanceOfLanding() + test.getTarget2().getChanceOfLanding() + test.getTarget3().getChanceOfLanding());
         }

         @Test
         public void pinballSimulationResultsTest()
         {
             int numberOfTestRuns = 100;

             PinballBoard results = PinballSimulator.runPinballGame(numberOfTestRuns);

             //Make sure the sum of probabilities of three targets = 100
             assertEquals(100, results.getTarget1().getChanceOfLanding() + results.getTarget2().getChanceOfLanding() + results.getTarget3().getChanceOfLanding());

             //Make sure the number of expected runs were complete and correct. i.e number of TotalLandings = numberOfTestRuns
             assertEquals(numberOfTestRuns, results.getTarget1().getNumberOfLandings() + results.getTarget2().getNumberOfLandings() + results.getTarget3().getNumberOfLandings());
         }

}
