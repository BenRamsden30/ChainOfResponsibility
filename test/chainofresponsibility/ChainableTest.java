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
        Chainable next = null;
        int clearance = 0;
        Chainable instance = null;
        Chainable expResult = null;
        Chainable result = instance.setNext(next, clearance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Check method, of class Chainable.
     */
    @Test
    public void testCheck() {
        System.out.println("Check");
        int C = 0;
        Chainable instance = null;
        boolean expResult = false;
        boolean result = instance.Check(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
