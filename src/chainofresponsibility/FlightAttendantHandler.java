/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author v8036651
 */
public class FlightAttendantHandler 
{
    private int clearanceLevel = 4;

    /**
     *Flight attendant constructor.
     * @param clearance
     */
    public FlightAttendantHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a flight attendant.
     * @param C
     * @return
     */
    public boolean FlightAttendantCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
