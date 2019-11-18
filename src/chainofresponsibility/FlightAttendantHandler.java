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
    /**
     * This is set to public for use in testing to ensure it is the correct return value.
     */
    public final Chainable defaultNext = new PilotHandler(clearanceLevel);
    private Chainable next;

    /**
     *Flight attendant constructor.
     * @param clearance
     */
    public FlightAttendantHandler(int clearance) 
    {
        super();
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
        if (C <= clearanceLevel)
        {
            System.out.println("Flight attendanats can handled this request.");
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
        this.next = next;
        return next;
    }
}
