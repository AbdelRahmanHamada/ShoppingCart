/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.List;

/**
 *
 * @author AbdelRahman
 */
public class CartCalculation {

    private Cart cart;

    public CartCalculation(Cart cart) {
        this.cart = cart;
    }

    public double getTotal() {
        return DPTotal() + QPTotal();
    }
    private double DPtotal = 0;

    public double DPTotal() {
        DPtotal = 0;
        cart.getDShopCart().forEach((Integer t, List<DateProduct> u) -> {
            u.stream().forEach((DateProduct DProduct) -> {
                DPtotal += DProduct.cost();
            });
        });
        return DPtotal;
    }
    private double QPtotal = 0;

    public double QPTotal() {
        QPtotal = 0;
        cart.getQShopCart().forEach((Integer t, QuantityProduct u) -> {
            QPtotal += u.cost();
        });
        return QPtotal;
    }

}
