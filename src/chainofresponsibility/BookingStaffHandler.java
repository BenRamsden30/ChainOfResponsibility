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
    public final Chainable defaultNext = new FlightAttendantHandler(clearanceLevel);
    /**
     *Booking staff constructor
     * @param clearance
     */
    public BookingStaffHandler(int clearance) 
    {
        super(clearance);
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
        System.out.println("Hello");
        return (C <= clearanceLevel);
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
        return next;
    }
}
