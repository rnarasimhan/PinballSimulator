package model;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 10/7/13
 * To change this template use File | Settings | File Templates.
 */
public class PinballBoard
{
    @Override
    public String toString()
    {
        return "{" +
                "target1=" + target1 + "\n"+
                "target2=" + target2 + "\n"+
                "target3=" + target3 +
                '}';
    }

    private final Target target1;
    private final Target target2;
    private final Target target3;


    public Target getTarget1()
    {
        return target1;
    }

    public Target getTarget2()
    {
        return target2;
    }

    public Target getTarget3()
    {
        return target3;
    }

    public PinballBoard ()
    {
        Random randomGenerator = new Random();

        //Generate a random number <=100
        int t1Chance =  randomGenerator.nextInt(100);
        this.target1 = new Target(t1Chance);

        //Generate a random number <= (100-t1)
        int t2Chance =  randomGenerator.nextInt(100-t1Chance);
        this.target2 = new Target(t2Chance);

        //Chance of t3Landing is 100 - sum of chances of T1 or T2 landing
        int t3Prob =  100-(t1Chance+t2Chance);
        this.target3 = new Target(t3Prob);
    }
}
