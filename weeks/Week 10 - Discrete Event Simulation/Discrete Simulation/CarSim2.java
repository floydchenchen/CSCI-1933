// CarSim2.java
// Main simulation driver
// Revised March 2017

// Uses instantiable Washer2 class and separate WasherEvent class.

// Uses PQ.java, Washer2.java, Stat2.java

public class CarSim2 {

    // public variables

    static PQ agenda = new PQ();
    public static Washer2[] washerList;

    // methods

    public static void main(String args[]) {

        washerList = new Washer2[1];  // only one washer for this simulation
        washerList[0] = new Washer2(0);    // create a car washer with queue
        
        int distArray[] = {20, 40};
        
//      First parameter to CarMaker in line below is arrival rate 
//      adjust this parameter to change load on the system
//      Middle parameter is the array of possible kinds of washes, by duration
//      and determine equilibrium  
//      Last parameter is the number of Washer2's

        agenda.add(new CarMaker2(35, distArray, 1), 10);

//      adjust simulation time to determine if system is at equilibrium

        while (agenda.getCurrentTime() <= 5000) {
            agenda.remove().run();
        }

        washerList[0].printStats();  // display statistics for this washer

    }  // main method
    

}  // CarSim2 class
