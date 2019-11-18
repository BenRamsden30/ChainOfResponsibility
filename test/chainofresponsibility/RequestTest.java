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
public class RequestTest {
    
    public RequestTest() {
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
     * Test of setDetails method, of class Request.
     */
    @Test
    public void testSetDetails() {
        System.out.println("setDetails");
        String details = "Test Data";
        Request instance = new Request(1, "Test",details);
        instance.setDetails(details);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetails method, of class Request.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Request instance = new Request(1, "Test","Test Data");
        String expResult = "Test Data";
        String result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClearence method, of class Request.
     */
    @Test
    public void testGetClearence() {
        System.out.println("getClearence");
        Request instance = new Request(1, "Test","Test data");
        int expResult = 1;
        int result = instance.getClearence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClearence method, of class Request.
     */
    @Test
    public void testSetClearence() {
        System.out.println("setClearence");
        int clearence = 1;
        Request instance = new Request(clearence, "Test","Test data");
        instance.setClearence(clearence);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Request.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Request instance = new Request(1, "Test","Test data");
        String expResult = "Test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Request.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Test";
        Request instance = new Request(1, description,"Test data");
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
