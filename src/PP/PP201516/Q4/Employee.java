package PP.PP201516.Q4;

public abstract class Employee {

    // Share attribute should be protected
   // protected int employeeType;
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public abstract void  SalaryStatement();
    //public abstract int getEmployeeType();

}
