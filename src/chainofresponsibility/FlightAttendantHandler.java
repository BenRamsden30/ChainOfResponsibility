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
public class FlightAttendantHandler extends Chainable
{
    private final int clearanceLevel = 4;
    private final Chainable defaultNext = new PilotHandler(clearanceLevel);

    /**
     *Flight attendant constructor.
     * @param clearance
     */
    public FlightAttendantHandler(int clearance) 
    {
        super(clearance);
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a flight attendant.
     * @param C
     * @return
     */
    @Override
    public boolean Check(int C)
    {
        return C <= clearanceLevel;
    }
    
    
    
    /**
     * Sets next in chain as the passed chainable which will allow to change the chain or defaults to pilot handler if passed null.
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
