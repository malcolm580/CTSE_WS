package Lab6.Part1;

public class Memento {

    private MyClass myClass;
    private int mState ;

    public Memento(MyClass mc){
        myClass = mc;
        mState = mc.getState();
    }

    public void restore(){
        myClass.setState(mState);
    }

}
