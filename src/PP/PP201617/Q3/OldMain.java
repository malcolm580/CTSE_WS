package PP.PP201617.Q3;

public class OldMain {
    public static void testDrive (FirstEngine eng) {
        String output = "Engine number [" + eng.getSerialNo( ) +
                "]" +"\n\t\t Original speed ["+ eng.getSpeed( ) + "]";
        eng.increaseSpeed(10);
        output += "\n\t\t Increase speed by 10 [" + eng.getSpeed( ) +"]";
        eng.decreaseSpeed(5);
        output += "\n\t\t Decrease speed by 5 [" + eng.getSpeed( ) +"]";
        output += "\n\t\t Test drive is ended";
        System.out.println(output);
    }
}
