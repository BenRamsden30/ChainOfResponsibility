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
public class Chainable 
{

    /**
     *Variables to be used by parent and sub classes.
     */
    protected  Chainable next;
    private int clearanceLevel;
    
    /**
     * Chainable constructor to act as super class. 
     * @param cl
     */
    public Chainable(int cl)
    {
        clearanceLevel = cl;
    }
    
    /**
     * Sets next in chain which will be overwritten by the handlers.
     * @param next 
     */
    public void setNext(Chainable next)
    {
        this.next = next;
    }
    
    /**
     * Sets the check method for the super class, this is overwritten by the handlers based on which is called.
     * @param request
     * @return 
     */
    public boolean handleRequest(Request request)
    {
        if (request.getClearence() <= clearanceLevel)
        {
            System.out.println(this.toString() + " can handled the request to " + request.getDescription());
            return true;
        }
        else
        {
            if(next != null) {
               return next.handleRequest(request);
            }
            else {
                System.out.println("No one to handle this request.");
                return false;
            }
        }
    }
    
    /**
     *
     * @return
     */
    public int getClearanceLevel() {
        return clearanceLevel;
    }
}

