package model.entity;

import model.entity.products.Product;

import java.util.Date;
import java.util.Map;

public class Order {


    private boolean isOrdered;
    private boolean isCancelled;
    private Date TimeOrder;
    private Map<Product, Integer> products;


    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Date getTimeOrder() {
        return TimeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        TimeOrder = timeOrder;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
