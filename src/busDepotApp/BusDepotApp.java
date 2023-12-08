package busDepotApp;

import java.util.ArrayList;

/**
 * Purpose:             busDepotApp<br />
 * Data Submitted:      2023/12/7 <br />
 * Assignment Number:    busDepotApp<br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          busDepotApp <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class BusDepotApp
{
    int countMaxAbove(ArrayList<BusDepot> list, int numberOfPassengers){
        int counter = 0;
        for (BusDepot bd : list){
            if(bd.maxPassengers > numberOfPassengers){
                counter++;
            }
        }
        return counter;
    }
    public Bus findBus(ArrayList<Bus> list, Bus bus){
        for(Bus b : list){
            if(b.equals(bus)){
                return b;
            }
        }
        return null;
    }

    public int countStowable(ArrayList<Bus> list){
        int counter = 0;
        for (Bus bus : list){
            if((bus instanceof Stowable) && ((Stowable) bus).canStow()){
                counter++;
            }
        }
        return counter;
    }

    public ArrayList<Bus> gatherOrphans(ArrayList<Bus> buses, ArrayList<BusDepot> busDepots){
        ArrayList<Bus> OrphanList = null;
        for(Bus bus : buses){
            for(BusDepot bd : busDepots){
                if(bd.canEnter(bus)){
                    break;
                }
            }
            OrphanList.add(bus);
        }
        return OrphanList;
    }

    public ArrayList<FeatureType> setFeatures(GreyhoundBus greyhoundBus, boolean movies,boolean gaming,boolean music){
        ArrayList<FeatureType> list = new ArrayList<>();
        if(movies){
            greyhoundBus.addFeature(FeatureType.Movies);
            list.add(FeatureType.Movies);
        }
        if(gaming){
            greyhoundBus.addFeature(FeatureType.Gaming);
            list.add(FeatureType.Gaming);
        }
        if(music){
            greyhoundBus.addFeature(FeatureType.Music);
            list.add(FeatureType.Music);
        }
        return list;
    }


}
