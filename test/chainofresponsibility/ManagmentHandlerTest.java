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
public class ManagmentHandlerTest {
    
    public ManagmentHandlerTest() {
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
     * Test of ManagmentCheck method, of class ManagementHandler.
     * test when below the required clearance.
     */
    @Test
    public void testManagmentCheck() {
        System.out.println("ManagmentCheck");
        int C = 0;
        ManagementHandler instance = new ManagementHandler(C);
        boolean expResult = false;
        boolean result = instance.ManagmentCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of ManagmentCheck method, of class ManagementHandler.
     * Test of when the clearnce is equal to the required.
     */
    @Test
    public void testManagmentCheck2() {
        System.out.println("ManagmentCheck");
        int C = 7;
        ManagementHandler instance = new ManagementHandler(C);
        boolean expResult = true;
        boolean result = instance.ManagmentCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of ManagmentCheck method, of class ManagementHandler.
     * Test of when the clearnce is above the required.
     */
    @Test
    public void testManagmentCheck3() {
        System.out.println("ManagmentCheck");
        int C = 10;
        ManagementHandler instance = new ManagementHandler(C);
        boolean expResult = true;
        boolean result = instance.ManagmentCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
