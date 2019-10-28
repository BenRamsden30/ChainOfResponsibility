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
    public FlightAttendantHandler(int clearance) 
    {
        int C = clearance;
    }
    
    public boolean FlightAttendantCheck(int C)
    {
        if (C >= clearanceLevel)
        {
            clearanceLevel = Incriment.Incrimented(C);
            return true;
        }
        return false;
    }
}
