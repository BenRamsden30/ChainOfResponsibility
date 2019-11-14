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
        request = "";
        if (test.ClearanceCheck(clearance) == true)
        {
        while (request.equals("EXIT") == false)
        {
            while (approved == false)
            {
                System.out.println("What level of request would you like to make?");
                request = scanner.nextLine().toUpperCase();
                switch (request) {
                    case "GENERAL STAFF":
                        {
                            GeneralStaffHandler testGeneralStaff = new GeneralStaffHandler(clearance);
                            if (testGeneralStaff.GeneralStaffCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "CLEANER":
                        {
                            CleanerHandler testCleaner = new CleanerHandler(clearance);
                            if (testCleaner.CleanerCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "BOOKING STAFF":
                        {
                            BookingStaffHandler testBookingStaff = new BookingStaffHandler(clearance);
                            if (testBookingStaff.BookingStaffCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "FLIGHT ATTENDANT":
                        {
                            FlightAttendantHandler testFlightAttendant = new FlightAttendantHandler(clearance);
                            if (testFlightAttendant.FlightAttendantCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "PILOT":
                        {
                            PilotHandler testPilot = new PilotHandler(clearance);
                            if (testPilot.PilotCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "FLIGHT CONTROL":
                        {
                            FlightControlHandler testFlightControl = new FlightControlHandler(clearance);
                            if (testFlightControl.FlightControlCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    case "MANAGMENT":
                        {
                            ManagmentHandler testManagment = new ManagmentHandler(clearance);
                            if (testManagment.ManagmentCheck(clearance) == true)
                            {
                                approved = true;
                                System.out.println("Passing to next section.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            else
                            {
                                System.out.println("You do Not have the clearance for this.");
                                approved = false;
                            }       break;
                        }
                    default:
                        System.out.println("Error - not an option, the program will now terminate.");
                        approved = true;
                        break;
                }
            }
            approved = false;
        }
        }
        else
        {
            System.out.println("Error - No such clearance. The Program mwill now terminate.");
        }
    }
}
