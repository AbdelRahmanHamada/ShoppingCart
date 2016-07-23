/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author AbdelRahman
 */
public class DateProduct extends AbstractProduct {

    private DateInterval date;
    private double pricePerDay;

    /**
     *
     */
    public DateProduct() {
    }

    /**
     *
     * @param date
     * @param pricePerDay
     */
    public DateProduct(DateInterval date, double pricePerDay) {
        this.date = date;
        this.pricePerDay = pricePerDay;
    }

    /**
     *
     * @return
     */
    public DateInterval getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(DateInterval date) {
        this.date = date;
    }

    /**
     * @return the pricePerDay
     */
    public double getPricePerDay() {
        return pricePerDay;
    }

    /**
     * @param pricePerDay the pricePerDay to set
     */
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double cost() {
        DateCalc calculator = new DateCalc(date);
        return getPricePerDay() * calculator.getHours();
    }

}
