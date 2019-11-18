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
    /**
     * This is set to public for use in testing to ensure it is the correct return value.
     */
    
    /**
     * Booking staff constructor
     */
    public BookingStaffHandler() 
    {
        super(3);
    }
    
    @Override
    public String toString()
    {
        return "BookingStaffHandler";
    }
    
    @Override
    public boolean handleRequest (Request request)
    {
        if (request.getClearence() <= this.getClearanceLevel())
        {
            System.out.println(this.toString() + " can handled the request to " + request.getDescription());
            System.out.println("Due to the request you will gain additional information about the flight:");
            System.out.println(request.getDetails());
            return true;
        }
        else
        {
            if(next != null) {
               return next.handleRequest(request);
            }
            else {
                System.out.println("No one to handle this request.");
                return false;
            }
        }
    }
}
