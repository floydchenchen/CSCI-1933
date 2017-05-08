// CarMaker2.java
// Revised March 2017

// CarMaker is a Car object generator.
// CarMaker produces a new Car Object each time it runs. 
// CarMaker reschedules itself randomly based on the average arrival interval.
// The method run() simulates the arrival of vehicles into the system.
// Car objects contain the time they were created and their service time.
// Generates Cars for all Washer2 instances and distributes evenly across them.
// Implements the Event (Event.java) interface.

public class CarMaker2 implements Event {

    // constructor

    public CarMaker2(int intval, int[] servDist, int n) {
        interval = intval;
        serviceDist = new int[servDist.length];
        System.arraycopy(servDist, 0, serviceDist, 0, servDist.length);
        howMany = n;
    }

    // methods

    private int intRandomInterval(int low, int high) {
        return (int) Math.floor((high - low) * Math.random() + low + 0.5);
    }

    private double selectServiceTime() {
        return serviceDist[intRandomInterval(0, serviceDist.length - 1)];
    }

    public void run() {
        CarSim2.agenda.add(new CarMaker2(interval, serviceDist, howMany),
                          intRandomInterval(0, 2 * interval));
        toWhichWasher = (int) (howMany * Math.random());
        Car2 newCar = new Car2(CarSim2.agenda.getCurrentTime(), 
                             selectServiceTime(), toWhichWasher);
    }

    private int interval;
    private int[] serviceDist;
    private int howMany;  // number of Washer2 instances
    private int toWhichWasher;

}  // CarMaker2 class
