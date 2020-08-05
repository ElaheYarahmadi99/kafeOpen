package model.entity.person;

import model.entity.Billing;
import model.entity.Order;

import javax.persistence.*;
import java.util.List;


@Table(name = "customer")
@Entity(name = "customer")
public class Customer extends Person {



    @Column(columnDefinition = "NUMBER")
    private Long payMoney;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "billingId")
    private Billing billing;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public List<Order> getOrder() {
        return orders;
    }

    public void setOrder(List<Order> order) {
        this.orders = order;
    }


    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }


}
