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
public class PilotHandler 
{
    private int clearanceLevel = 5;

    /**
     *Handler constructor
     * @param clearance
     */
    public PilotHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *This checks if the user has the clearance for something requiring the
     * clearance of a pilot.
     * @param C
     * @return
     */
    public boolean PilotCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
