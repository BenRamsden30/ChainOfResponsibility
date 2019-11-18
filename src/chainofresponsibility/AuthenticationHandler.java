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
    private int clearance;
    
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
         * Sets up a management handler to be called later.
         */
        Chainable M = new ManagementHandler(clearance);
        
        G.setNext(C, clearance);
        C.setNext(B, clearance);
        B.setNext(FA, clearance);
        FA.setNext(P, clearance);
        P.setNext(FC, clearance);
        FC.setNext(M, clearance);
        
        G.Check(clearance);
        
        
    }
}
