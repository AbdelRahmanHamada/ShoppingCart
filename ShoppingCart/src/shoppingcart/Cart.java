/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AbdelRahman
 */
public class Cart {

    private Map<Integer, QuantityProduct> qShopCart;
    private Map<Integer, List<DateProduct>> dShopCart;
    private CartCalculation calc;

    public Cart() {
        this(new HashMap<>(), new HashMap<>());
    }

    protected Cart(Map<Integer, QuantityProduct> qShopCart, Map<Integer, QuantityProduct> dShopCart) {
        this.qShopCart = qShopCart;
        calc = new CartCalculation(this);
    }

    public void addDateProduct(DateProduct dPro) {
        List<DateProduct> list = getDShopCart().get(dPro.getID());
        if (list != null) {
            list.add(dPro);
        } else {
            list = new ArrayList<>();
            list.add(dPro);
            getDShopCart().put(dPro.getID(), list);
        }
    }

    public boolean removeDateProduct(DateProduct dPro) {
        List<DateProduct> list = getDShopCart().get(dPro.getID());
        if (list != null) {
            list.remove(dPro);
            return true;
        }
        return false;
    }

    public void addQuantiyProduct(QuantityProduct qProduct) {
        QuantityProduct qPro = getQShopCart().get(qProduct.getID());
        if (qPro == null) {
            getQShopCart().put(qProduct.getID(), qProduct);
        } else {
            qPro.incrementBy(qProduct.getQuantity());
        }
    }

    public boolean removeQuantityProduct(int id, int quantity) {
        QuantityProduct qPro = getQShopCart().get(id);
        if (qPro != null) {
            checkAndRemoveQP(qPro, quantity);
            return true;
        }
        return false;
    }

    private void checkAndRemoveQP(QuantityProduct qPro, int quantity) {
        if (qPro.getQuantity() <= quantity) {
            getQShopCart().remove(qPro.getID());
        } else {
            qPro.incrementBy(quantity * -1);
        }
    }

    /**
     * @return the qShopCart
     */
    public Map<Integer, QuantityProduct> getQShopCart() {
        return qShopCart;
    }

    /**
     * @return the dShopCart
     */
    public Map<Integer, List<DateProduct>> getDShopCart() {
        return dShopCart;
    }

    public double TotalCost() {
        return calc.getTotal();
    }

}
