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
public class FlightAttendantHandler extends ChainableHandler
{
    /**
     *Flight attendant constructor.
     */
    public FlightAttendantHandler() 
    {
        super(4);
    }
    
    @Override
    public String toString()
    {
        return "FlightAttendantHandler";
    }
}
