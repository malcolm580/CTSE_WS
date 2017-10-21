package PP.PP201516.Q4;

public class PtEmployee extends Employee {

    //public static final int PartTime = 1;
    private int hourlyWage;
    private int hoursOfWork;

    public PtEmployee(String name, int hourlyWage, int hoursOfWork){
        super(name);
     //   this.employeeType = PartTime;
        this.hourlyWage = hourlyWage;
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public void SalaryStatement() {
        System.out.println("Part Time Staff - Name: " + name +
                ", Hours of Works : "+ hoursOfWork + ", Hourly Wage : $ " + hourlyWage +
                ", Salary: $ " + hourlyWage*hoursOfWork);
    }

}
