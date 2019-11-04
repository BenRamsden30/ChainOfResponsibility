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
    private int clearanceLevel = 3;
    public BookingStaffHandler(int clearance) 
    {
        int C = clearance;
    }
    
    public boolean BookingStaffCheck(int C)
    {
        return C >= clearanceLevel;
    }
}
