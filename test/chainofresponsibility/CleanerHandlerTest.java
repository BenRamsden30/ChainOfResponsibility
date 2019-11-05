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
public class CleanerHandlerTest {
    
    public CleanerHandlerTest() {
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
     * Test of CleanerCheck method, of class CleanerHandler.
     * Test of when clearance is below that which is required.
     */
    @Test
    public void testCleanerCheck() {
        System.out.println("CleanerCheck");
        int C = 0;
        CleanerHandler instance = new CleanerHandler(C);
        boolean expResult = false;
        boolean result = instance.CleanerCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of CleanerCheck method, of class CleanerHandler.
     * Test when the clearance level is the same as that required.
     */
    @Test
    public void testCleanerCheck2() {
        System.out.println("CleanerCheck");
        int C = 2;
        CleanerHandler instance = new CleanerHandler(C);
        boolean expResult = true;
        boolean result = instance.CleanerCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of CleanerCheck method, of class CleanerHandler.
     * tests when a value greater than that required is passed.
     */
    @Test
    public void testCleanerCheck3() {
        System.out.println("CleanerCheck");
        int C = 10;
        CleanerHandler instance = new CleanerHandler(C);
        boolean expResult = true;
        boolean result = instance.CleanerCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
