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
public class Request {

    /**
     *
     * @param clearence
     * @param description
     * @param details
     */
    public Request(int clearence, String description, String details) {
        this.clearence = clearence;
        this.description = description;
        this.details = details;
    }
    
    private int clearence;
    private String description;
    private String details;

    /**
     *
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     *
     * @return
     */
    public String getDetails() {
        return details;
    }

    /**
     *
     * @return
     */
    public int getClearence() {
        return clearence;
    }

    /**
     *
     * @param clearence
     */
    public void setClearence(int clearence) {
        this.clearence = clearence;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
