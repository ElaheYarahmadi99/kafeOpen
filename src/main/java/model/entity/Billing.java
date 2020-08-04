package model.entity;

import model.entity.person.Customer;
import model.entity.products.Product;

import javax.persistence.*;
import java.util.List;

@Table(name = "billing")
@Entity(name = "billing")
public class Billing {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billingId;
    @OneToOne(mappedBy = "billing")
    private Customer customer;


    @Column(columnDefinition = "NUMBER")
    private Long totalPrice;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private List<Product> products;

    @OneToOne(mappedBy = "billing")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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
