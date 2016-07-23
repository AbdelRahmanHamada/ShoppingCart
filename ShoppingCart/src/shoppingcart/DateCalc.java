/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author AbdelRahman
 */
public class DateCalc {

    private DateInterval dateInterval;

    /**
     *
     * @param dateInterval
     */
    public DateCalc(DateInterval dateInterval) {
        this.dateInterval = dateInterval;
    }

    /**
     *
     * @return
     */
    public double getHours() {
        long time = dateInterval.getEnd().getTime() - dateInterval.getStart().getTime();
        long hours = TimeUnit.MILLISECONDS.toHours(time);
        long nMinutes = hours * 60;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(time);
        long rMinutes = minutes - nMinutes;
        return hours + rMinutes / 60.0;
    }
}
