package Lab1.Q2;

public class Client {

    public Client() {
    }

    public void doAction(){
        ServerInterface si = new Server();
        System.out.println("Lab1.Q2.Client: do Action");
        si.doService();

        si = new Server2();
        si.doService();
    }
}