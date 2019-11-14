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
public class Chainable 
{
    private Chainable next;
    private final int clearance;
    /**
     * Chainable constructor to act as super class. 
     * @param C
     */
    public Chainable(int C)
    {
        clearance = C;
    }
    
    
    
    /**
     * Sets next in chain which will be overwritten by the handlers.
     * @param next
     * @param clearance
     * @return 
     */
    public Chainable setNext(Chainable next,int clearance)
    {
        return new Chainable(clearance);
    }
    
    /**
     * Sets the check method for the super class, this is overwritten by the handlers based on which is called.
     * @param C
     * @return 
     */
    public boolean Check(int C)
    {
        return C>0;
    }
}
