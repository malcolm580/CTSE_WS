package Lab5.Part2;

public class TaskEntry {
    private Task task;
    private long repeatInterval;
    private long timeLastDone;

    public TaskEntry( Task task , long repeatInterval ){
        this.task = task;
        this.repeatInterval = repeatInterval;
        timeLastDone = System.currentTimeMillis();
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public long getTimeLastDone() {
        return timeLastDone;
    }

    public void setTimeLastDone(long timeLastDone) {
        this.timeLastDone = timeLastDone;
    }

}
