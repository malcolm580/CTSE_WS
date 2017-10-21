package PP.PP201617.Q4;

public class PersonalLoan extends Loan
{
    private static final double ratio = 10;
    private int salary;

    public PersonalLoan( String client , int salary )
    {
        super( client );
        this.salary = salary;
    }

    public void showLoan()
    {
        System.out.println("Personal loan for : " + client);
        double maxAmount = salary * ratio;
        System.out.println("Maximun loan amount $:" + maxAmount);
    }
}
