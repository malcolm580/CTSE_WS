package Lab6.Part1;

public class MyClass {

    private int state;

    public MyClass(){
        state =1;
    }


    public void doAction(){
        state++;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
