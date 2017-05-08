// Example 27a
// Priority Queue and Simulation
// Revised November 2016

// CarSim is the driver routine for the Car Wash Simulation
// Uses PQ.java, Washer.java, Stat.java

public class CarSim {

    // public variables

    static PQ agenda = new PQ();
    static Washer washer;  // the car washer

    // methods

    public static void main(String args[]) {

        int distArray[] = {20, 40};
        
//      first parameter to CarMaker in line below is arrival rate 
//        adjust this parameter to change load on the system
//        and determine equilibrium  

        agenda.add(new CarMaker(38, distArray), 10);

//      washer = new Washer();
        
//      adjust simulation time to determine is system is at equilibrium

        while (agenda.getCurrentTime() <= 15000)
            agenda.remove().run();

        Stat.displayStats();

    }  // main method
    

}  // CarSim class
