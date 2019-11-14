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
    Chainable next;
    /**
     * Chainable constructor to act as super class.
     * @param clearance 
     */
    public Chainable(int clearance)
    {
        next = new Chainable(clearance);
    }
    
    
    
    /**
     * Sets next in chain which will be overwritten by the handlers.
     * @param clearance
     * @return 
     */
    public Chainable setNext(int clearance)
    {
        return new Chainable(clearance);
    }
}
