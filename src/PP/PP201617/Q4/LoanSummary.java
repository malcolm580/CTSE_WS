package PP.PP201617.Q4;

import java.util.ArrayList;

public class LoanSummary
{
    private static ArrayList<Loan> loans;


    public static void main (String[] args){
        loans = new ArrayList<>();
        loans.add(new PersonalLoan("Tom" , 15000)) ;
        loans.add (new MortgageLoan("Fung" , 300000));
        printLoan();
    }

    public static void printLoan()
    {
        for (Loan loan : loans){
            loan.showLoan();
        }
    }
}
