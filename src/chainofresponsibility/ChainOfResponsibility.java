/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author v8036651
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int clearence = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your clearance level?");
        clearence = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your request?");
        String request = scanner.nextLine();

        /**
         * Sets up a general staff handler to be called later.
         */
        ChainableHandler G = new GeneralStaffHandler();
        /**
         * Sets up a cleaner handler to be called later.
         */
        ChainableHandler C = new CleanerHandler();
        /**
         * Sets up a booking staff handler to be called later.
         */
        ChainableHandler B = new BookingStaffHandler();
        /**
         * Sets up a flight attendant handler to be called later.
         */
        ChainableHandler FA = new FlightAttendantHandler();
        /**
         * Sets up a pilot handler to be called later.
         */
        ChainableHandler P = new PilotHandler();
        /**
         * Sets up a flight control handler to be called later.
         */
        ChainableHandler FC = new FlightControlHandler();
        /**
         * Sets up a management handler to be called later.
         */
        ChainableHandler M = new ManagementHandler();
        
        G.setNext(C);
        C.setNext(B);
        B.setNext(FA);
        FA.setNext(P);
        P.setNext(FC);
        FC.setNext(M);
        
        G.handleRequest(new Request(clearence, request,"The fliught time is 14:00 and the date is 18/11/2019"));
    }
    
}
