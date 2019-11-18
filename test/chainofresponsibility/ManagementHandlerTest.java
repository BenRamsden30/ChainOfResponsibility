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
public class ManagementHandlerTest {
    
    public ManagementHandlerTest() {
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
     * Test of toString method, of class ManagementHandler.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ManagementHandler instance = new ManagementHandler();
        String expResult = "ManagementHandler";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * When request is the same level or lower.
     * Test of handleRequest method, of class BookingStaffHandler.
     */
    @Test
    public void testHandleRequest() {
        System.out.println("handleRequest");
        Request request = new Request(7, "Flights","The fliught time is 14:00 and the date is 18/11/2019");
        ManagementHandler instance = new ManagementHandler();
        boolean expResult = true;
        boolean result = instance.handleRequest(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
      * When request requires higher clearance.
     * Test of handleRequest method, of class BookingStaffHandler.
     */
    @Test
    public void testHandleRequest2() {
        System.out.println("handleRequest");
        Request request = new Request(8, "Flights","The fliught time is 14:00 and the date is 18/11/2019");
        ManagementHandler instance = new ManagementHandler();
        boolean expResult = false;
        boolean result = instance.handleRequest(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
