package Assignment.Stock;

public class InstantNoodleMemento implements Memento {

    private int weight;
    private int balance;
    private InstantNoodle orig;

    public InstantNoodleMemento(InstantNoodle o , int balance , int weight) {
        orig = o;
        this.balance = balance;
        this.weight = weight;
    }

    public void restore(){
        orig.balance = this.balance;
        orig.weight = this.weight;
    }
}

