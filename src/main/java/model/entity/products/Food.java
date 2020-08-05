package model.entity.products;

import javax.persistence.*;

@Table(name = "food")
@Entity(name = "food")
public class Food extends Product {


    @Column(columnDefinition = "NUMBER")
    private int numberOfFood;

    private Long price;
    private String productDescription;

    public int getNumberOfFood() {
        return numberOfFood;
    }

    public void setNumberOfFood(int numberOfFood) {
        this.numberOfFood = numberOfFood;
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
