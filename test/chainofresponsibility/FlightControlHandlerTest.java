/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v8036651
 */
public class FlightControlHandlerTest {
    
    public FlightControlHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  /**
     * Test of GeneralStaffCheck method, of class GeneralStaffHandler.
     * Test for when below the required clearance.
     */
    @Test
    public void testCheck() {
        System.out.println("FlightControlCheck");
        int C = 0;
        GeneralStaffHandler instance = new GeneralStaffHandler(C);
        boolean expResult = true;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of GeneralStaffCheck method, of class GeneralStaffHandler.
     * Equal to the required clearance.
     */
    @Test
    public void testCheck2() {
        System.out.println("FlightControlCheck");
        int C = 1;
        GeneralStaffHandler instance = new GeneralStaffHandler(C);
        boolean expResult = true;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of GeneralStaffCheck method, of class GeneralStaffHandler.
     * When the clearance is greater than that which is required.
     */
    @Test
    public void testCheck3() {
        System.out.println("FlightControlCheck");
        int C = 10;
        GeneralStaffHandler instance = new GeneralStaffHandler(C);
        boolean expResult = false;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Set next in chain when passed null value.
     * Test of setNext method, of class GeneralStaffHandler.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Chainable next = null;
        int clearance = 5;
        PilotHandler instance = new PilotHandler(clearance);
        Chainable expResult = instance.defaultNext;
        Chainable result = instance.setNext(next, clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
    /**
     * Set next in chain when passed a value for next in chain.
     * Test of setNext method, of class GeneralStaffHandler.
     */
    @Test
    public void testSetNext2() {
        System.out.println("setNext");
        int clearance = 5;
        Chainable next = new PilotHandler(clearance);
        PilotHandler instance = new PilotHandler(clearance);
        Chainable expResult = next;
        Chainable result = instance.setNext(next, clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
