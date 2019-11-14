/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.*;

/**
 *
 * @author v8036651
 */
public class AuthenticationHandler 
{
    private String request;
    private int clearance;
    private boolean approved = false;
    
    /**
     *This is uses to replicate user input. THis would be replaced with the rest of the larger program.
     */
    public AuthenticationHandler()
    {
        Scanner scanner = new Scanner(System.in);
        ClearanceHandler test = new ClearanceHandler();
        System.out.println("What is your clearance level?");
        clearance = scanner.nextInt();
        test.ClearanceCheck(clearance);
        
        
        
        /**
         * A is the Cahinable that deals with all of the handlers and calls each one up.
         */
        Chainable A = new Chainable(clearance);
        /**
         * Sets up a general staff handler to be called later.
         */
        Chainable G = new GeneralStaffHandler(clearance);
        /**
         * Sets up a cleaner handler to be called later.
         */
        Chainable C = new CleanerHandler(clearance);
        /**
         * Sets up a booking staff handler to be called later.
         */
        Chainable B = new BookingStaffHandler(clearance);
        /**
         * Sets up a flight attendant handler to be called later.
         */
        Chainable FA = new FlightAttendantHandler(clearance);
        /**
         * Sets up a pilot handler to be called later.
         */
        Chainable P = new PilotHandler(clearance);
        /**
         * Sets up a flight control handler to be called later.
         */
        Chainable FC = new FlightControlHandler(clearance);
        /**
         * Sets up a management handler to be called later.
         */
        Chainable M = new ManagementHandler(clearance);
        
        
        A = G;
        /**
         * Start of code running of an example.
         */
        if (A.Check(clearance))
        {
            System.out.println(" General staff can handle.");
            System.exit(0);
        }
        else
        {
            System.out.println("General Staff cannot handle this request or is currently unavalible..");
        }
        
        
        
        A = A.setNext(B,clearance);
        /**
         * Cleaner Busy therefore pass past cleaner and run check with booking staff instead.
         */
        if (A.Check(clearance))
        {
            System.out.println("Booking staff will take this request.");
            System.exit(0);
        }
        else
        {
            System.out.println("Booking Staff cannot handle this request or is currently unavalible..");
        }
        
        
        
        A = A.setNext(C, clearance);
        /**
         * Pass backwards to cleaner handler
         */
        if (A.Check(clearance))
        {
            System.out.println("Cleaner can handle this request .");
            System.exit(0);
        }
        else
        {
            System.out.println("The cleaner cannot handle this request or is currently unavalible.. ");
        }
        
        
        /**
         * Passes null as the Chainable therefore using the default next instead so passing to booking staff.
         * Replicates if a a booking staff had opened up to check again.
         */
        A = A.setNext(null, clearance);
        if (A.Check(clearance))
        {
            System.out.println("Booking staff will take this request.");
            System.exit(0);
        }
        else
        {
            System.out.println("Booking Staff cannot handle this request or is currently unavalible.");
        }
        
        
        A = A.setNext(M,clearance);
        /**
         * Passes forward to management as in this scenario those in between are busy.
         */
        if(A.Check(clearance))
        {
            System.out.println("Managment has taken the request.");
            System.exit(0);
        }
        else
        {
            System.out.println("Managment cannot handle this request.");
            System.out.println("ERROR - Nobody can handle this request!");
            System.exit(0);
        }
        
        
        
    }
}
