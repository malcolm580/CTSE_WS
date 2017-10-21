package PP.PP201516.Q4;

public class SalarySummary {
    private Employee[] employees;
    private String year;
    private String month;

    public SalarySummary(Employee[] employees, String year, String month) {
        this.employees = employees;
        this.year = year;
        this.month = month;
    }

    public void printSalarySummary() {
        System.out.println("Salary Summary for " + month + "," + year + " : - ");
        for (int i = 0; i < employees.length; i++)
            employees[i].SalaryStatement();
    }
}
