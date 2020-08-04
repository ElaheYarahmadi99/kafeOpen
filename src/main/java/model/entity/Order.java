package model.entity;

import model.entity.person.Customer;
import model.entity.products.Product;

import java.util.Date;
import java.util.Map;

public class Order extends Entities{


    private Long orderId;
    private boolean isOrdered;
    private boolean isCancelled;
    private Date TimeOrder;
    private Customer customer;
    private Billing billing;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

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


}
