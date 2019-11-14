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
public class GeneralStaffHandler extends Chainable
{
    private int clearanceLevel = 1;
    private final Chainable defaultNext = new CleanerHandler(clearanceLevel);

    /**
     *General staff constructor.
     * @param clearance
     */
    public GeneralStaffHandler(int clearance) 
    {
        super(clearance);
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a General employee.
     * @param C
     * @return
     */
    public boolean GeneralStaffCheck(int C)
    {
        return C >= clearanceLevel;
    }
    
    
    
    /**
     * Sets next in chain as the passed chainable object or defaults to the cleaner handler.
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
