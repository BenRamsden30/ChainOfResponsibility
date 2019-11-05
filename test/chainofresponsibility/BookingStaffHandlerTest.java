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
public class BookingStaffHandlerTest {
    
    public BookingStaffHandlerTest() {
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
     * Test of BookingStaffCheck method, of class BookingStaffHandler.
     * This is if the value is not equal to the expected.
     */
    @Test
    public void testBookingStaffCheck() {
        System.out.println("BookingStaffCheck");
        int C = 0;
        BookingStaffHandler instance = new BookingStaffHandler(C);
        boolean expResult = false;
        boolean result = instance.BookingStaffCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of BookingStaffCheck method, of class BookingStaffHandler.
     * This is if the value is equal to the expected.
     */
    @Test
    public void testBookingStaffCheck2() {
        System.out.println("BookingStaffCheck");
        int C = 3;
        BookingStaffHandler instance = new BookingStaffHandler(C);
        boolean expResult = true;
        boolean result = instance.BookingStaffCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of BookingStaffCheck method, of class BookingStaffHandler.
     * This is if the value is larger than the expected value.
     */
    @Test
    public void testBookingStaffCheck3() {
        System.out.println("BookingStaffCheck");
        int C = 7;
        BookingStaffHandler instance = new BookingStaffHandler(C);
        boolean expResult = true;
        boolean result = instance.BookingStaffCheck(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
