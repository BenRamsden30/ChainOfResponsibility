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
     *
     * @param clearance
     */
    public FlightAttendantHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean FlightAttendantCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
