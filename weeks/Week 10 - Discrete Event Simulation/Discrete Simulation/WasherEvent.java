// WasherEvent.java
// New in March 2017
// Goes with CarSim2, Washer2, CarMaker2, Car2

public class WasherEvent implements Event {

public WasherEvent(double serviceTime, int n) {
     which = n;
     servTime = serviceTime;
}


public void run() {

        Car2 car;

        if (CarSim2.washerList[which].isBusy()) { // event means wash finished
          CarSim2.washerList[which].getStats().updateServiceTimeStats(servTime);
          CarSim2.washerList[which].getStats().updateBusyTimeStats(CarSim2.agenda.getCurrentTime());
        }
        else  // this instance invoked because a new car arrived at idle wash
          CarSim2.washerList[which].getStats().updateIdleTimeStats(CarSim2.agenda.getCurrentTime());

        if (CarSim2.washerList[which].getQLength() == 0) {
          CarSim2.washerList[which].setBusy(false);  // do nothing until a new car arrival
        }
        else {
          CarSim2.washerList[which].setBusy(true);  // start on next car in queue
          car = CarSim2.washerList[which].remove();
          CarSim2.washerList[which].getStats().updateQueueStats(CarSim2.agenda.getCurrentTime(),
                                CarSim2.washerList[which].getQLength());
          CarSim2.washerList[which].getStats().updateWaitTimeStats(CarSim2.agenda.getCurrentTime(),
                                   car.getArrivalTime());
          servTime = car.getServiceTime();
          CarSim2.agenda.add(new WasherEvent(servTime, which),
                            servTime);
        }

    }  // run method

    private int which;
    private double servTime;

}  // WasherEvent
