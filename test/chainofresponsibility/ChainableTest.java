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
import org.junit.Ignore;

/**
 *
 * @author v8036651
 */
public class ChainableTest {
    
    public ChainableTest() {
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
     * Test of setNext method, of class Chainable.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Chainable next = new BookingStaffHandler();
        Chainable instance = new GeneralStaffHandler();
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of handleRequest method, of class Chainable.
     */
    @Test
    public void testHandleRequest() {
        System.out.println("handleRequest");
        Request request = new Request(1, "Test","The fliught time is 14:00 and the date is 18/11/2019");
        Chainable instance = new Chainable(1);
        boolean expResult = true;
        boolean result = instance.handleRequest(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClearanceLevel method, of class Chainable.
     */
    @Test
    public void testGetClearanceLevel() {
        System.out.println("getClearanceLevel");
        Chainable instance = new Chainable(1);
        int expResult = 1;
        int result = instance.getClearanceLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
