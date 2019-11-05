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
     * Test of FlightControlCheck method, of class FlightControlHandler.
     * When the clearance is lower than required.
     */
    @Test
    public void testFlightControlCheck() {
        System.out.println("FlightControlCheck");
        int C = 0;
        FlightControlHandler instance = new FlightControlHandler(C);
        boolean expResult = false;
        boolean result = instance.FlightControlCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of FlightControlCheck method, of class FlightControlHandler.
     * Check when the clearance is equal to the expected.
     */
    @Test
    public void testFlightControlCheck2() {
        System.out.println("FlightControlCheck");
        int C = 6;
        FlightControlHandler instance = new FlightControlHandler(C);
        boolean expResult = true;
        boolean result = instance.FlightControlCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of FlightControlCheck method, of class FlightControlHandler.
     * Test when the clearance is greater than that required.
     */
    @Test
    public void testFlightControlCheck3() {
        System.out.println("FlightControlCheck");
        int C = 10;
        FlightControlHandler instance = new FlightControlHandler(C);
        boolean expResult = true;
        boolean result = instance.FlightControlCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
