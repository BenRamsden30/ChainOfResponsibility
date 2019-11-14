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
public class ManagementHandler extends Chainable
{
    private final int clearanceLevel = 7;
    private final Chainable defaultNext = null;
    
    /**
     *Management constructor
     * @param clearance
     */
    public ManagementHandler(int clearance) 
    {
        super(clearance);
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a manager.
     * @param C
     * @return
     */
    @Override
    public boolean Check(int C)
    {
        return C <= clearanceLevel;
    }
    
    
    
    /**
     * sets default to null as unable to pass further for defualt however if it could be handled by a previous person it can be passed backwards.
     * @param next
     * @param clearance
     * @return 
     */
    @Override
    public Chainable setNext(Chainable next, int clearance) 
    {
        if(next == null)
        {
            return defaultNext;
        }
        return next;
    }
}
