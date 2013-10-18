package model;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 10/7/13
 * To change this template use File | Settings | File Templates.
 */
public class Target
{
    private final int chanceOfLanding;
    private int numberOfLandings;

    public int getNumberOfLandings()
    {
        return numberOfLandings;
    }

    public Target(int chanceOfLanding)
    {
        this.chanceOfLanding = chanceOfLanding;
        this.numberOfLandings = 0;
    }

    @Override
    public String toString()
    {
        return "{" +
                "chanceOfLanding=" + chanceOfLanding +  "%"+
                ", numberOfLandings=" + numberOfLandings +
                '}';
    }

    public int getChanceOfLanding()
    {
        return chanceOfLanding;
    }

    public void incrementNumberOfLandings()
    {
        this.numberOfLandings+=1;
    }
}