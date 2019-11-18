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
public class PilotHandler extends Chainable
{
    private final int clearanceLevel = 5;
    /**
     * This is set to public for use in testing to ensure it is the correct return value.
     */
    public final Chainable defaultNext = new FlightControlHandler(clearanceLevel);
    private Chainable next;

    /**
     *Handler constructor
     * @param clearance
     */
    public PilotHandler(int clearance) 
    {
        super();
        int C = clearance;
    }
    
    /**
     *This checks if the user has the clearance for something requiring the
     * clearance of a pilot.
     * @param C
     * @return
     */
    @Override
    public boolean Check(int C)
    {
        if (C <= clearanceLevel)
        {
            System.out.println("Pilots can handled this request.");
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
     * Sets default to flight control handler for if null is passed otherwise sets next in chain to next.
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
