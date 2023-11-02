package ex_9_6;


public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis(); 
        this.endTime = 0; 
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis(); 
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0; 
        }
        return endTime - startTime; 
    }

}
