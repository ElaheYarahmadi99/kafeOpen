package model.entity;

import model.entity.person.Customer;
import model.entity.products.Product;

public class Billing {

    private Long billingId;
    private Customer customer;
    private Long totalPrice;
    private Product product;

    public Product getProduct() {
        return product;

    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getBillingId() {
        return billingId;
    }

    public void setBillingId(Long billingId) {
        this.billingId = billingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
