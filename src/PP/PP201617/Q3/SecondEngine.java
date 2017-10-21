package PP.PP201617.Q3;

public class SecondEngine {
    String engineId;
    //engineId is same as serialNo in FirstEngine
    int speed;

    public SecondEngine() {
        this("0000", 0);
    }

    public SecondEngine(String engineId, int speed) {
        this.engineId = engineId;
        this.speed = speed;
    }

    public String getEngineId() {
        return engineId;
    }

    public int getSpeed() {
        return speed;
    }

    /*
    add speed: mile is (+X) means increase X mile;
    is (–X) means decrease X mile
    */
    public void addSpeed(int mile) {
        speed += mile;
    }

}
