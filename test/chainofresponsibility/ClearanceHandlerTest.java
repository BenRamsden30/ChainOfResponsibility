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
public class ClearanceHandlerTest {
    
    public ClearanceHandlerTest() {
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
     * Test of ClearanceCheck method, of class ClearanceHandler.
     */
    @Test
    public void testClearanceCheck() {
        System.out.println("ClearanceCheck");
        int clearance = 0;
        ClearanceHandler instance = new ClearanceHandler();
        boolean expResult = false;
        boolean result = instance.ClearanceCheck(clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
