package model.entity;


import model.entity.products.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "billing")
public class Billing {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "billingSeq",sequenceName ="billing_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "billingSeq")
    private Long id;


    /*@OneToOne(mappedBy = "billing")
    private Customer customer;*/


    @Column(columnDefinition = "NUMBER")
    private Long totalPrice;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk")
    private List<Product> products;



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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /*public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/
}
