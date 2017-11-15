package Lab6.Part2;

public class Main {
    public static void main(String args[]) {
        Caretaker ct = new Caretaker();

        Customer cust1 = new Customer("Peter" , "Wanchai");

        Account acct1 = new Account("INT001" , 200.0);
        ct.saveCustomer(cust1);
        cust1.addAccount(acct1);

        Account acct2 = new Account("INT002" , 100.0);
        ct.saveCustomer(cust1);
        cust1.addAccount(acct1);
        System.out.println(cust1);

        ct.saveAccount(acct1);
        acct1.increase(50.0);
        System.out.println(acct1);

        ct.saveAccount(acct2);
        acct2.decrease(100.0);
        System.out.println(acct2);

        ct.saveCustomer(cust1);
        cust1.removeAccount(acct1);
        System.out.println(cust1);

        ct.undo();
        System.out.println(cust1);
    }
}
