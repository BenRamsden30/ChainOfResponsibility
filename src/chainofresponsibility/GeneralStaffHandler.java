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
public class GeneralStaffHandler 
{
    private int clearanceLevel = 1;

    /**
     *
     * @param clearance
     */
    public GeneralStaffHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean GeneralStaffCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
