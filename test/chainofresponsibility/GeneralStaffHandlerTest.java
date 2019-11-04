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
public class GeneralStaffHandlerTest {
    
    public GeneralStaffHandlerTest() {
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
     * Test of GeneralStaffCheck method, of class GeneralStaffHandler.
     */
    @Test
    public void testGeneralStaffCheck() {
        System.out.println("GeneralStaffCheck");
        int C = 0;
        GeneralStaffHandler instance = null;
        boolean expResult = false;
        boolean result = instance.GeneralStaffCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
