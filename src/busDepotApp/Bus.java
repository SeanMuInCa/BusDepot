package busDepotApp;

/**
 * Purpose:             work through the various steps of OO design <br />
 * To use run the main method. <br />
 * Data Submitted:      2023/11/11 <br />
 * Assignment Number:   Step1  <br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          Bus.java <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public abstract class Bus implements Comparable<Bus>
{

    private int sizeEngine;
    private int busLength;
    private int passengerCapacity = 20;
    private String licenseNum;

    public Bus(String licenseNum)
    {
        this.licenseNum = licenseNum;
    }

    public Bus(int sizeEngine, int busLength, int passengerCapacity, String licenseNum)
    {
        this.sizeEngine = sizeEngine;
        this.busLength = busLength;
        this.passengerCapacity = passengerCapacity;
        this.licenseNum = licenseNum;
    }

    public int getSizeEngine()
    {
        return sizeEngine;
    }

    public int getBusLength()
    {
        return busLength;
    }

    public int getPassengerCapacity()
    {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int capacity)
    {
        this.passengerCapacity = capacity;
    }

    @Override
    public String toString()
    {
        return "< licenseNum: "+ licenseNum + " > | < sizeEngine: " + sizeEngine + " > | < passengerCapacity: " + passengerCapacity + " >";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return licenseNum.equals(bus.licenseNum);
    }

    public abstract int getTurnRadius();
}
