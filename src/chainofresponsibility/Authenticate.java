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
public class Authenticate 
{
    private String request;
    private int clearance;
    private boolean approved = false;
    
    public Authenticate()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What level of request would you like to make?");
        request = scanner.nextLine().toUpperCase();
        scanner.nextLine();
//        System.out.println("What is your clearance level?");
//        clearance = scanner.nextInt();

        
        while (request.equals("EXIT") == false)
        {
            while (approved == false)
            {
                System.out.println("What is your clearance level?");
                clearance = scanner.nextInt();
                
                switch (request) {
                    case "GENERAL STAFF":
                        {
                            GeneralStaffHandler test = new GeneralStaffHandler(clearance);
                            if (test.GeneralStaffCheck(clearance) == true)
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
                            CleanerHandler test = new CleanerHandler(clearance);
                            if (test.CleanerCheck(clearance) == true)
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
                            BookingStaffHandler test = new BookingStaffHandler(clearance);
                            if (test.BookingStaffCheck(clearance) == true)
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
                            FlightAttendantHandler test = new FlightAttendantHandler(clearance);
                            if (test.FlightAttendantCheck(clearance) == true)
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
                            PilotsHandler test = new PilotsHandler(clearance);
                            if (test.PilotsCheck(clearance) == true)
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
                            FlightControlHandler test = new FlightControlHandler(clearance);
                            if (test.FlightControlCheck(clearance) == true)
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
                            ManagmentHandler test = new ManagmentHandler(clearance);
                            if (test.ManagmentCheck(clearance) == true)
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
                        break;
                }
            System.out.println("What level of request would you like to make?");
            request = scanner.nextLine().toUpperCase();
            approved = false;
            }
        }
    }
}
