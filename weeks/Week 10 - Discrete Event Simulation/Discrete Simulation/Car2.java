// Car2.java
// Revised March 2017

// Car class the represents cars in the carwash simulation
// Car objects contain the time they were created and their service time.
// Car objects are immediately queued in the washer queue.
// Car objects are passive except in constructor (creation)

public class Car2 {

    // constructor

    public Car2(double t, double servTime, int which) {
        arrivalTime = t;
        serviceTime = servTime;
        CarSim2.washerList[which].enter(this);
        if (!CarSim2.washerList[which].isBusy())
          new WasherEvent(servTime, which).run();  // wake-up washer if idle
    }

    public double getArrivalTime() {
        return arrivalTime;
    }
  
    public double getServiceTime() {
        return serviceTime;
    }

    // private variables
         
    private double arrivalTime;
    private double serviceTime;

}  // Car2 class
