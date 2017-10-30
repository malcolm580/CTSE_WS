package Lab5.Part2;

public class NextPrimeNumberTask implements Task {

    private int nextPrimeNumber;

    public NextPrimeNumberTask(){
        nextPrimeNumber = 2;
    }

    @Override
    public void performTask() {
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= nextPrimeNumber/2; i++) {
                if (nextPrimeNumber % i == 0)
                    isPrime = false;
            }

            if (isPrime) {
                System.out.println("Next prime number is : " + nextPrimeNumber);
                nextPrimeNumber++;
                break;
            }
            nextPrimeNumber++;
        }
    }
}
