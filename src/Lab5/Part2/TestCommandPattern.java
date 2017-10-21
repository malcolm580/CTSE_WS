package Lab5.Part2;

public class TestCommandPattern{
        public static void main(String [] args) {
            TaskMinder tm = new TaskMinder(100);

            NextNumberTask next = new NextNumberTask();
            TaskEntry numberTaskEntry = new TaskEntry(next , 3000);
            tm.addTaskEntry(numberTaskEntry);

            NextPrimeNumberTask nextPrime = new NextPrimeNumberTask();
            TaskEntry primeNumberTaskEntry = new TaskEntry(nextPrime , 7000);
            tm.addTaskEntry(primeNumberTaskEntry);

            tm.run();
        }
}
