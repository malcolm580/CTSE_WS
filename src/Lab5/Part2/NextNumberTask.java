package Lab5.Part2;

public class NextNumberTask implements Task {

    private int nextNumber;

    public NextNumberTask(){
        nextNumber = 1;
    }

    @Override
    public void performTask() {
        System.out.println("Next number is : " + nextNumber);
        nextNumber++;
    }
}
