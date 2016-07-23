/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Date;

/**
 *
 * @author AbdelRahman
 */
public class DateInterval {

    private Date start;
    private Date end;

    /**
     *
     */
    public DateInterval() {
    }

    /**
     *
     * @param start
     * @param end
     */
    public DateInterval(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    /**
     *
     * @return
     */
    public Date getStart() {
        return start;
    }

    /**
     *
     * @param start
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     *
     * @return
     */
    public Date getEnd() {
        return end;
    }

    /**
     *
     * @param end
     */
    public void setEnd(Date end) {
        this.end = end;
    }

}
