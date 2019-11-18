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
    /**
     * This is set to public for use in testing to ensure it is the correct return value.
     */
    public final Chainable defaultNext = new ManagementHandler(clearanceLevel);
    private Chainable next;

    /**
     *Flight control constructor.
     * @param clearance
     */
    public FlightControlHandler(int clearance) 
    {
        super();
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
        if (C <= clearanceLevel)
        {
            System.out.println("Flight control can handled this request.");
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
        this.next = next;
        return next;
    }
}
