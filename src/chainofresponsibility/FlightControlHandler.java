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
     *Flight control constructor.
     * @param clearance
     */
    public FlightControlHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a flight control operator.
     * @param C
     * @return
     */
    public boolean FlightControlCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
