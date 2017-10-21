package Lab1.Q1;

class Client {

	public Client() {
	}
	
	public void doAction() {
		System.out.println("Lab1.Q2.Client: doActino");
		Server s = new Server();
		s.doService();
		
		s = new Server2();
		s.doService();
	}
}