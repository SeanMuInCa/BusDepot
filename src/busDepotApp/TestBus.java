package busDepotApp;

/**
 * Purpose:             To output sum of two integers. <br />
 * To use run the main method. <br />
 * Data Submitted:      2023/11/11 <br />
 * Assignment Number:   Lab 1  <br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          busDepotApp <br />
 *
 * @author Zhenghua Mu (instructor - no SDC#)
 * @version 1.0.0
 */
public class TestBus
{
    public static void main(String[] args)
    {

        GreyhoundBus sb = new GreyhoundBus("muzhenghua",FeatureType.values());
        AccessBus b = new AccessBus("a",true,5);
        SchoolBus s = new SchoolBus("abc",true);
        System.out.println(b.getBusLength());
        System.out.println(b.getTurnRadius());
        System.out.println(sb.getBusLength());
        System.out.println(sb.getTurnRadius());
        System.out.println(s.getBusLength());
        System.out.println(s.getTurnRadius());
        BusDepot bd = new BusDepot(44,51);
        System.out.println(bd.canEnter(sb));
        System.out.println(bd.canEnter(s));
        System.out.println(bd.canEnter(b));
        System.out.println(b.compareTo(s));
    }
}
