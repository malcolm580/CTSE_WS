package PP.PP201617.Q4;

public class MortgageLoan extends Loan
{
    private static final double ratio = 0.8;
    private int property;

    public MortgageLoan(String client , int property )
    {
        super( client );
        this.property = property;
    }

    public void showLoan()
    {
        System.out.println("Mortgage loan for : " + client);
        double maxAmount = (int)(property * ratio);
        System.out.println("Maximun loan amount $:" + maxAmount);
    }
}
