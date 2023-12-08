package busDepotApp;

/**
 * Purpose:             Sub Classes of Bus <br />
 * Data Submitted:      2023/11/11 <br />
 * Assignment Number:   Step2  <br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          SchoolBus.java <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class SchoolBus extends Bus
{
    //A SchoolBus can carry 3 pieces of luggage per foot of length
    private boolean stopArmInstalled;

    public SchoolBus(String licenseNum, boolean stopArmInstalled)
    {
        super(450,25,20,licenseNum);
        this.stopArmInstalled = stopArmInstalled;
    }

    public void setStopArmInstalled(boolean stopArmInstalled)
    {
        this.stopArmInstalled = stopArmInstalled;
    }

    public boolean isArmInstalled(){
        return stopArmInstalled;
    }
    @Override
    public int getTurnRadius()
    {
        return this.getBusLength() + 20;
    }

    @Override
    public String toString()
    {
        return "SchoolBus{" +
                "stopArmInstalled=" + stopArmInstalled +
                "} " + super.toString();
    }
    @Override
    public int compareTo(Bus bus)
    {
        return this.getPassengerCapacity() - bus.getPassengerCapacity();
    }
}
