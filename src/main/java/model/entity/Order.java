package model.entity;

import model.entity.person.Customer;
import model.entity.products.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;



@Table(name = "order")
@Entity(name = "order")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    @Column(columnDefinition = "Date")
    private Date TimeOrder;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billingId")
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


    public Date getTimeOrder() {
        return TimeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        TimeOrder = timeOrder;
    }


}
