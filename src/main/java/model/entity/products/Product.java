package model.entity.products;

import model.entity.Billing;
import model.entity.Entities;

import javax.persistence.*;


@Table(name = "product")
@Entity(name = "product")
public class Product extends Entities {



    @Column(columnDefinition = "NUMBER")
    private Long price;
    @Column(columnDefinition = "NUMBER")
    private int numberOfProduct;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String productDescription;



    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }




}
