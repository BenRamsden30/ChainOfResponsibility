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
public class FlightAttendantHandlerTest {
    
    public FlightAttendantHandlerTest() {
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
     * Test of FlightAttendantCheck method, of class FlightAttendantHandler.
     * Tests the response when the value is below that which is required.
     */
    @Test
    public void testFlightAttendantCheck() {
        System.out.println("FlightAttendantCheck");
        int C = 0;
        FlightAttendantHandler instance = new FlightAttendantHandler(C);
        boolean expResult = false;
        boolean result = instance.FlightAttendantCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of FlightAttendantCheck method, of class FlightAttendantHandler.
     * Tests the response when the value is below that which is required.
     */
    @Test
    public void testFlightAttendantCheck2() {
        System.out.println("FlightAttendantCheck");
        int C = 4;
        FlightAttendantHandler instance = new FlightAttendantHandler(C);
        boolean expResult = true;
        boolean result = instance.FlightAttendantCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of FlightAttendantCheck method, of class FlightAttendantHandler.
     * Tests the response when the value is below that which is required.
     */
    @Test
    public void testFlightAttendantCheck3() {
        System.out.println("FlightAttendantCheck");
        int C = 10;
        FlightAttendantHandler instance = new FlightAttendantHandler(C);
        boolean expResult = true;
        boolean result = instance.FlightAttendantCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
