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
public class FlightControlHandler 
{
    private int clearanceLevel = 1;
    public FlightControlHandler(int clearance) 
    {
        int C = clearance;
    }
    
    public boolean FlightControlCheck(int C)
    {
        if (C >= clearanceLevel)
        {
            clearanceLevel = Incriment.Incrimented(C);
            return true;
        }
        return false;
    }
}
