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
     * Test of ClearanceCheck method, when on lower boundary.
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
    
    /**
     * Test of ClearanceCheck method, when on upper boundary.
     */
    @Test
    public void testClearanceCheck2() {
        System.out.println("ClearanceCheck");
        int clearance = 8;
        ClearanceHandler instance = new ClearanceHandler();
        boolean expResult = false;
        boolean result = instance.ClearanceCheck(clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of ClearanceCheck method, when in boundaries.
     */
    @Test
    public void testClearanceCheck3() {
        System.out.println("ClearanceCheck");
        int clearance = 4;
        ClearanceHandler instance = new ClearanceHandler();
        boolean expResult = true;
        boolean result = instance.ClearanceCheck(clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of ClearanceCheck method, when below lower boundary.
     */
    @Test
    public void testClearanceCheck4() {
        System.out.println("ClearanceCheck");
        int clearance = -1;
        ClearanceHandler instance = new ClearanceHandler();
        boolean expResult = false;
        boolean result = instance.ClearanceCheck(clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of ClearanceCheck method, when above upper boundary.
     */
    @Test
    public void testClearanceCheck5() {
        System.out.println("ClearanceCheck");
        int clearance = 10;
        ClearanceHandler instance = new ClearanceHandler();
        boolean expResult = false;
        boolean result = instance.ClearanceCheck(clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
