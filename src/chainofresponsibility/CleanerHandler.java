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
public class CleanerHandler extends Chainable
{
    private int clearanceLevel = 2;
    private final Chainable defaultNext = new BookingStaffHandler(clearanceLevel);

    /**
     *Cleaner constructor.
     * @param clearance
     */
    public CleanerHandler(int clearance) 
    {
        super(clearance);
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a CLEANER.
     * @param C
     * @return
     */
    public boolean CleanerCheck(int C)
    {
        return C >= clearanceLevel;
    }
    
    
    
    /**
     * Sets next in chain based on default if passed a null or uses the passed hander to set next in chain.
     * @param next
     * @param clearance
     * @return 
     */
    public Chainable setNext(Chainable next, int clearance) 
    {
        if(next == null)
        {
            return defaultNext;
        }
        return next;
    }
}
