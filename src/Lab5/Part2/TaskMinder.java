package Lab5.Part2;

import java.util.Vector;

public class TaskMinder extends Thread {
	private long sleepInterval;
	//private long repeatInterval1, repeatInterval2;
	//private long timeLastDone1, timeLastDone2;
	//private int nextNumber, nextPrimeNumber;
	private long now;
	// create a vector to store TaskEntry
	private Vector TaskEntryVector;

	public TaskMinder(long sleepInterval) {
		this.sleepInterval = sleepInterval;
		TaskEntryVector = new Vector();
	}

	public void run() {
		while(true) {
			try {
				sleep(sleepInterval);
				now = System.currentTimeMillis();

				for(int i =0 ; i<TaskEntryVector.size() ; i++){
					TaskEntry te = (TaskEntry) TaskEntryVector.elementAt(i);
					long repeatInterval = te.getRepeatInterval();
					long timeLastDone = te.getTimeLastDone();
					Task task = te.getTask();
					task.performTask();
				}
			}
			catch (Exception e) {
				System.out.println("Interrupted sleep : " + e);
			}
		}
	}

	public void addTaskEntry( TaskEntry taskEntry ){
		this.TaskEntryVector.add(taskEntry);
	}

}

