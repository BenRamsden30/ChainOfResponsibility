/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author v8036651
 */
public class BookingStaffHandler 
{
    private final int clearanceLevel = 3;

    /**
     *
     * @param clearance
     */
    public BookingStaffHandler(int clearance) 
    {
        int C = clearance;
    }
    
    /**
     *
     * @param C
     * @return
     */
    public boolean BookingStaffCheck(int C)
    {
        return (C >= clearanceLevel);
    }
}
