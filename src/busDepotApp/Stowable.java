package busDepotApp;

/**
 * Purpose:             busDepotApp<br />
 * Data Submitted:      2023/11/27 <br />
 * Assignment Number:   step 3-4p<br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          Stowable.java <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public interface Stowable
{
    int MIN_LUGGAGE = 2;

    // The following required method will return true if a
    // bus's luggage capacity per passenger is calculated to
    // be greater than or equal to the above constant.
    boolean canStow();
}
