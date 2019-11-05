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
     *
     * @param clearance
     */
    public PilotHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean PilotCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
