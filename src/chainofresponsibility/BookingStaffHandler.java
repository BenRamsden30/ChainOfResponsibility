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
public class BookingStaffHandler extends Chainable
{
    private final int clearanceLevel = 3;
    /**
     * This is set to public for use in testing to ensure it is the correct return value.
     */
    public final Chainable defaultNext = new FlightAttendantHandler(clearanceLevel);
    private Chainable next;
    /**
     *Booking staff constructor
     * @param clearance
     */
    public BookingStaffHandler(int clearance) 
    {
        super();
        int C = clearance;
    }
    
    /**
     **This checks if the user has the clearance for something requiring the
     * clearance of a booking staff employee.
     * @param C
     * @return
     */
    @Override
    public boolean Check(int C)
    {
        if (C <= clearanceLevel)
        {
            System.out.println("Booking staff can handled this request.");
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
     * Sets the next in chain or has a default next in chain if no value is passed.
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
