// Stat2.java
// Revised March 2017
// Allows for stats for multiple Washer2s, as it is instantiable

// Statistics class for Car Simulation

public class Stat2 {

    // constructors

    public Stat2(int n) {
        index = n;
    }

    // public methods

    public void updateQueueStats(double time, int qlen) {
        
        if (qlen > maxQLength)
          maxQLength = qlen;
        averageQLength += oldQLength * (time - lastQUpdateTime);
        totalTime += time - lastQUpdateTime;
        lastQUpdateTime = time;
        oldQLength = qlen;
    }

    public void updateBusyTimeStats(double time) {

        busyTime += time - lastUpdateTime;
        lastUpdateTime = time;
    }        

    public void updateIdleTimeStats(double time) {
        
        idleTime += time - lastUpdateTime;
        lastUpdateTime = time;
    }

    public void updateServiceTimeStats(double st) {
   
        averageServiceTime += st;
    }

    public void updateWaitTimeStats(double time, double enterTime) {
    
        double wait = time - enterTime;
        if (wait > maxWait)
          maxWait = wait;
        averageWait += wait;
        count++;  // another leaves the waiting queue
    } 

    public void displayStats() {
        System.out.println("\n Washer: " + index + "    ");
        System.out.println("\n** Simulation Results **\n");
        System.out.println(" Calculated Simulation Time: " + totalTime);
        System.out.println(" Idle Time: " + idleTime);
        System.out.println(" Busy Time: " + busyTime);
        System.out.println(" (Busy Time based on service time: " + 
                                               averageServiceTime + ")\n");
        System.out.println(" Maximum Queue Length: " + maxQLength);
        System.out.println(" Avg. Queue Length: " + averageQLength/totalTime);
        System.out.println(" Maximum Waiting Time: " + maxWait);
        System.out.println(" Avg. Waiting Time for cars through the queue: " +
                                                 averageWait/count);
        System.out.println(" Avg. Service Time: " + averageServiceTime/
                                                       count);
        System.out.println(" Number of cars through system: " + count);
        System.out.println("\n");

    }  // displayStats

    // private variables

    private int index;
    private double lastUpdateTime;
    private int oldQLength;
    private double lastQUpdateTime;
    
    private int count;
    private double totalTime;
    private double busyTime;
    private double idleTime;
    private double maxWait;
    private double averageWait;
    private int maxQLength;
    private double averageQLength; 
    private double averageServiceTime;

}  // Stat2 class
