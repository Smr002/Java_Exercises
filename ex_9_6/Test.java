package ex_9_6;

public class Test {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

       
        stopwatch.start();

       
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     
        stopwatch.stop();

       
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds"
                            +"\n" + "Start is:" + stopwatch.getStartTime()
                            +" milliseconds" + "\n"
                    +"End Time is:" + stopwatch.getEndTime() + " milliseconds");
    }

}
