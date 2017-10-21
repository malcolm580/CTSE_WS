package PP.PP201617.Q4;

public abstract class Loan
{
    protected String client;


    public Loan(  String client )
    {
        this.client = client;

    }

    
    public abstract void showLoan();
}
