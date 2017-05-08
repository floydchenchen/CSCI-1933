// Washer2.java
// Priority Queue and Simulation
// Updated Washer class that does NOT implement event - March 2017.  
// Instead, Washer represents only the Washer itself and not
// WashEvents.  
// See new class WashEvent.java which represents a completion of
// a Wash.

// Washer is the class that models the car washer and it's waiting line

public class Washer2 {

    // constructors

    public Washer2(int n) {
        washerIndex = n;
        waitLine = new Q2();  // the queue for this Washer2's waiting cars
        busy = false;  // newly created Washer2 is not busy
        stats = new Stat2(n);  // create a stat collector class for this Washer2
    }

    // methods

    public void enter(Car2 c) {
        waitLine.add(c);
        stats.updateQueueStats(CarSim2.agenda.getCurrentTime(),
                              getQLength());
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean b) {
        busy = b;
    }

    public int getQLength() {
        return waitLine.length();
    }

    public int getWasherIndex() {
        return washerIndex;
    }

    public Car2 remove() {
        return (Car2) waitLine.remove();
    }

    public Stat2 getStats() { // returns the Stat2 instance for this Washer2
        return stats;
    }

    public void printStats() {
        stats.displayStats(); 
    }

    // private variables

    private boolean busy;  // status of this Washer2 
    private Q2 waitLine;  // holds cars waiting to be washed by this Washer2
    private int washerIndex;  // index of this Washer2
    private Stat2 stats;

}  // Washer2 class
