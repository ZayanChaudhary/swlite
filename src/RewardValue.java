public class RewardValue
{
    private double cashval;
    private double mileval;

    private static final double m2c = 0.0035;

    public RewardValue(double cashval)
    {
        this.cashval = cashval;
        this.mileval = cashval / m2c;
    }

    public RewardValue(int mileval)
    {
        this.mileval = mileval;
        this.cashval = mileval * m2c;
    }

    public double getCashValue()
    {
        return cashval;
    }

    public double getMilesValue()
    {
        return mileval;
    }
}
