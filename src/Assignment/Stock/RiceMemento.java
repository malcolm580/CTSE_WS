package Assignment.Stock;

public class RiceMemento implements Memento {

    private String type;
    private int balance;
    private Rice orig;

    public RiceMemento(Rice o , int balance , String type) {
        orig = o;
        this.balance = balance;
        this.type = type;
    }

    public void restore(){
        orig.balance = this.balance;
        orig.type = this.type;
    }
}

