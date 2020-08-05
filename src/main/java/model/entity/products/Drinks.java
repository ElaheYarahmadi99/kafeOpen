package model.entity.products;

import javax.persistence.*;

@Table(name = "drinks")
@Entity(name = "drinks")
public class Drinks extends Product {


    private Long price;
    private String productDescription;


    @Column(columnDefinition = "NUMBER")
    private int numberOfDrinks;

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public void setNumberOfDrinks(int numberOfDrinks) {
        this.numberOfDrinks = numberOfDrinks;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
