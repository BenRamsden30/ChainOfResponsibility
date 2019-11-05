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
public class ClearanceHandler 
{

    /**
     *
     */
    public ClearanceHandler()
    {
        
    }
    
    /**
     *
     * @param clearance
     * @return
     */
    public boolean ClearanceCheck(int clearance)
    {
        int C = clearance;
        return ((C > 0) && (C < 8));
    }
}
