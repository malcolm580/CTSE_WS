package PP.PP201516.Q4;

public class Main {
    public static void main(String args[]){

        Employee[] employees = new Employee[2];
        employees[0] = new FtEmployee("Fung",200);
        employees[1]  = new PtEmployee("Chan",20,10);

        SalarySummary summary = new SalarySummary(employees , "2015" , "10");
        summary.printSalarySummary();
    }
}
