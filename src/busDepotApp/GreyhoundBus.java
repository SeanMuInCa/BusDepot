package busDepotApp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Purpose:             Sub Classes of Bus <br />
 * To use run the main method. <br />
 * Data Submitted:      2023/11/11 <br />
 * Assignment Number:   step 2  <br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          busDepotApp <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class GreyhoundBus extends Bus implements Stowable,Comparable<Bus>
{
    final int piecesOfLuggagePerFoot = 6;

    /*public enum featureType {
        Movies,
        Gaming,
        Music
    }*/
    private FeatureType[] entertainmentFeatures;

    public GreyhoundBus(String licenseNum, FeatureType[] features)
    {
        super(0,50,50,licenseNum);
        this.entertainmentFeatures = features;
    }

    public FeatureType[] getFeatures()
    {
        return entertainmentFeatures;
    }

    public boolean removeFeature(FeatureType feature) {
        ArrayList<FeatureType> list = new ArrayList<>(Arrays.asList(FeatureType.values()));
        return list.remove(feature);
    }
    public boolean addFeature(FeatureType feature) {
        ArrayList<FeatureType> list = new ArrayList<>();
        return list.add(feature);
    }
    @Override
    public int getTurnRadius()
    {
        return this.getBusLength() * 2;
    }

    @Override
    public String toString()
    {
        return "GreyhoundBus{" +
                "entertainmentFeatures=" + Arrays.toString(entertainmentFeatures) +
                "} " + super.toString();
    }

    @Override
    public boolean canStow()
    {
        return (this.getBusLength() * this.piecesOfLuggagePerFoot / this.getPassengerCapacity()) >= MIN_LUGGAGE;
    }

    @Override
    public int compareTo(Bus bus)
    {
        return this.getPassengerCapacity() - bus.getPassengerCapacity();
    }
}