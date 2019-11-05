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
    public void testPilotCheck() {
        System.out.println("PilotCheck");
        int C = 0;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = false;
        boolean result = instance.PilotCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of PilotCheck method, of class PilotHandler.
     * Test for when the clearance is equal to that which is required.
     */
    @Test
    public void testPilotCheck2() {
        System.out.println("PilotCheck");
        int C = 5;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = true;
        boolean result = instance.PilotCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of PilotCheck method, of class PilotHandler.
     * Test when the clearance is larger than required.
     */
    @Test
    public void testPilotCheck3() {
        System.out.println("PilotCheck");
        int C = 10;
        PilotHandler instance = new PilotHandler(C);
        boolean expResult = true;
        boolean result = instance.PilotCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
