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
         * Sets up a managment handler to be called later.
         */
        Chainable M = new ManagmentHandler(clearance);
        
        
        
        /**
         * Start of code running of an example.
         */
        if (G.Check(clearance))
        {
            System.out.println(" General staff can handle.");
            System.exit(0);
        }
        else
        {
            System.out.println("General Staff cannot handle this request.");
        }
        
        
        
        /**
         * Cleaner Busy therefore pass past cleaner and run check with booking staff instead.
         */
        B = G.setNext(B,clearance);
        if (B.Check(clearance))
        {
            System.out.println("Booking staff will take this request.");
            System.exit(0);
        }
        else
        {
            System.out.println("Booking Staff cannot handle this request.");
        }
        
        
        
        /**
         * Pass backwards to cleaner handler
         */
        C = B.setNext(C, clearance);
        if (C.Check(clearance))
        {
            System.out.println("Cleaner can handle this request.");
            System.exit(0);
        }
        else
        {
            System.out.println("The cleaner cannot handle this request. ");
        }
        
        
        
        /**
         * Passes forward to managment as in this scenario those in between are busy.
         */
        M = C.setNext(M, clearance);
        if(M.Check(clearance))
        {
            System.out.println("Managment has taken the request.");
            System.exit(0);
        }
        else
        {
            System.out.println("ERROR - Nobody can handle this request!");
            System.exit(0);
        }
        
        
        
    }
}
