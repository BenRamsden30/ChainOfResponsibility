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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author v8036651
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({chainofresponsibility.CleanerHandlerTest.class, chainofresponsibility.ManagementHandlerTest.class, chainofresponsibility.BookingStaffHandlerTest.class, chainofresponsibility.GeneralStaffHandlerTest.class, chainofresponsibility.RequestTest.class, chainofresponsibility.ChainOfResponsibilityTest.class, chainofresponsibility.FlightAttendantHandlerTest.class, chainofresponsibility.PilotHandlerTest.class, chainofresponsibility.ChainableTest.class, chainofresponsibility.FlightControlHandlerTest.class})
public class ChainofresponsibilitySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
