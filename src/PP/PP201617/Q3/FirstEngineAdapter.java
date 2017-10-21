package PP.PP201617.Q3;

public class FirstEngineAdapter extends FirstEngine {

    private SecondEngine adaptee;

    public FirstEngineAdapter( SecondEngine adaptee) {
        super();
        this.adaptee = adaptee;
    }

    public String getSerialNo() {
        return adaptee.getEngineId();
    }

    public int getSpeed() {
        return adaptee.getSpeed();
    }

    // decrease speed
    public void decreaseSpeed(int mile) {
        adaptee.addSpeed(-mile);
    }

    // increase speed
    public void increaseSpeed(int mile) {
        adaptee.addSpeed(mile);
    }
}
