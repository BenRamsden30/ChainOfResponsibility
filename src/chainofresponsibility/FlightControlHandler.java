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
public class FlightControlHandler extends Chainable
{
    private final int clearanceLevel = 6;
    private final Chainable defaultNext = new ManagementHandler(clearanceLevel);

    /**
     *Flight control constructor.
     * @param clearance
     */
    public FlightControlHandler(int clearance) 
    {
        super(clearance);
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a flight control operator.
     * @param C
     * @return
     */
    @Override
    public boolean Check(int C)
    {
        return C <= clearanceLevel;
    }
    
    
    
    /**
     * Sets next in chain to the passed Chainable or defaults to Managementhandler
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
