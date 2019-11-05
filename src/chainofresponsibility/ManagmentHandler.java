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
public class ManagmentHandler 
{
    private int clearanceLevel = 7;

    /**
     *Managment constructor
     * @param clearance
     */
    public ManagmentHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a manager.
     * @param C
     * @return
     */
    public boolean ManagmentCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
