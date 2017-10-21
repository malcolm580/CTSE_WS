package PP.PP201617.Q3;

public class Test {
    public static void main(String args[]){
        FirstEngine target = new FirstEngineAdapter(new SecondEngine("3",30));
        FirstEngine original = new FirstEngine("2",20);
        OldMain.testDrive(target);
        OldMain.testDrive(original);
    }
}
