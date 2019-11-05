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
    private int clearanceLevel = 6;

    /**
     *
     * @param clearance
     */
    public FlightControlHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean FlightControlCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
