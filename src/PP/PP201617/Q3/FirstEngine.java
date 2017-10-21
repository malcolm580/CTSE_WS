package PP.PP201617.Q3;

public class FirstEngine {
    protected String serialNo;
    protected int speed;

    public FirstEngine() {
        this("0000", 0);
    }

    public FirstEngine(String serialNo, int speed) {
        this.serialNo = serialNo;
        this.speed = speed;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public int getSpeed() {
        return speed;
    }

    // decrease speed
    public void decreaseSpeed(int mile) {
        speed -= mile;
    }

    // increase speed
    public void increaseSpeed(int mile) {
        speed += mile;
    }
}
