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
    private int clearance = 0;
    /**
     * Chainable constructor to act as super class. 
     */
    public Chainable()
    {
        
    }
    
    /**
     * Sets next in chain which will be overwritten by the handlers.
     * @param next
     * @param clearance
     * @return 
     */
    public Chainable setNext(Chainable next,int clearance)
    {
        return new Chainable();
    }
    
    /**
     * Sets the check method for the super class, this is overwritten by the handlers based on which is called.
     * @param C
     * @return 
     */
    public boolean Check(int C)
    {
        if (C < clearance)
        {
            System.out.println("I can handled this request.");
            return true;
        }
        else
        {
            if(next != null) {
               return next.Check(C);
            }
            else {
                System.out.println("No one to handle this request.");
                return false;
            }
        }
    }
}

