package busDepotApp;

import java.util.ArrayList;

/**
 * Purpose:             busDepotApp<br />
 * Data Submitted:      2023/11/27 <br />
 * Assignment Number:    step3-4<br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          busDepot.java <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class BusDepot
{
    private int turnAroundSize;// represents the room available for a bus to turn around in feet
    private int maxPassengers;//represents the maximum number of passengers (per bus) that the Depot allows
    private ArrayList<Bus> busParking;

    public BusDepot(int turnAroundSize, int maxPassengers)
    {
        this.turnAroundSize = turnAroundSize;
        this.maxPassengers = maxPassengers;
    }
    public boolean canEnter(Bus bus) {
        return (this.turnAroundSize > bus.getTurnRadius()) && (maxPassengers > bus.getPassengerCapacity());
    }
    public boolean addBus(Bus bus) {
        if(canEnter(bus) && !busParking.contains(bus)){
            busParking.add(bus);
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Bus> getBusList() {
        return this.busParking;
    }
    public int getTurnSize() {
        return this.turnAroundSize;
    }

    @Override
    public String toString()
    {
        return "BusDepot{" +
                "turnAroundSize=" + turnAroundSize +
                ", maxPassengers=" + maxPassengers +
                ", busParking=" + busParking +
                '}';
    }

    public int getMaxPassengers()
    {
        return maxPassengers;
    }
}
