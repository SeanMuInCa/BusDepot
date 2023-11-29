package busDepotApp;

/**
 * Purpose:             Sub Classes of Bus <br />
 * To use run the main method. <br />
 * Data Submitted:      2023/11/11 <br />
 * Assignment Number:   step 2   <br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          busDepotApp <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class AccessBus extends Bus implements Comparable<Bus>
{
    //An AccessBus can carry 1 piece of luggage per foot of length.
    private boolean hasWheelChair;
    private int liftCapacity;

    public AccessBus(String licenseNum, boolean hasWheelChair, int liftCapacity)
    {
        super(0,15,12,licenseNum);
        this.hasWheelChair = hasWheelChair;
        this.liftCapacity = liftCapacity;
    }
    public boolean hasLift(){//no further information
        return false;
    }

    public void setHasWheelChair(boolean hasWheelChair)
    {
        this.hasWheelChair = hasWheelChair;
    }

    public void setLiftCapacity(int liftCapacity)
    {
        this.liftCapacity = liftCapacity;
    }

    public int getLiftCapacity()
    {
        return liftCapacity;
    }

    @Override
    public int getTurnRadius()
    {
        return this.getBusLength();
    }

    @Override
    public String toString()
    {
        return "AccessBus{" +
                "hasWheelChair=" + hasWheelChair +
                ", liftCapacity=" + liftCapacity +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Bus bus)
    {
        return this.getPassengerCapacity() - bus.getPassengerCapacity();
    }
}
