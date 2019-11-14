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
         * 
         */
        Chainable G = new GeneralStaffHandler(clearance);
        
        Chainable C = new GeneralStaffHandler(clearance);
        
        Chainable B = new GeneralStaffHandler(clearance);
        
        Chainable FA = new GeneralStaffHandler(clearance);
        
        Chainable P = new GeneralStaffHandler(clearance);
        
        Chainable FC = new GeneralStaffHandler(clearance);
        
        Chainable M = new GeneralStaffHandler(clearance);
        
    }
}
