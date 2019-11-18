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
public class PilotHandlerTest {
    
    public PilotHandlerTest() {
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
     * Test of PilotCheck method, of class PilotHandler.
     * Test for when clearance is less than that which is required.
     */
    @Test
    public void testCheck() {
        System.out.println("PilotCheck");
        int C = 0;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = true;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of PilotCheck method, of class PilotHandler.
     * Test for when the clearance is equal to that which is required.
     */
    @Test
    public void testCheck2() {
        System.out.println("PilotCheck");
        int C = 5;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = true;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of PilotCheck method, of class PilotHandler.
     * Test when the clearance is larger than required.
     */
    @Test
    public void testCheck3() {
        System.out.println("PilotCheck");
        int C = 10;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = false;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Set next in chain when passed null value.
     * Test of setNext method, of class PilotHandler.
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
     * Test of setNext method, of class PilotHandler.
     */
    @Test
    public void testSetNext2() {
        System.out.println("setNext");
        int clearance = 5;
        Chainable next = new CleanerHandler(clearance);
        PilotHandler instance = new PilotHandler(clearance);
        Chainable expResult = next;
        Chainable result = instance.setNext(next, clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
