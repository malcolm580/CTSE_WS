package PP.PP201516.Q4;

public class FtEmployee extends Employee {

   // public static final int FullTime = 0;
    private int monthlySalary;

    public FtEmployee(String name,int monthlySalary){
        super(name);
    //    this.employeeType = FullTime;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void SalaryStatement() {
        System.out.println("Full Time Staff - Name: " + name
                +", Monthly Salary : $ "+monthlySalary);
    }

}
