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
public class CleanerHandler 
{
    private int clearanceLevel = 2;

    /**
     *
     * @param clearance
     */
    public CleanerHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean CleanerCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
