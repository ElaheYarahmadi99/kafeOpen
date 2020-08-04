package model.entity.products;

import javax.persistence.*;

@Table(name = "cakes")
@Entity(name = "cakes")
public class Cakes extends Product {

    private Long price;
    private String productDescription;

    @Column(columnDefinition = "NUMBER")
    private int numberOfCakes;

    public int getNumberOfCakes() {
        return numberOfCakes;
    }

    public void setNumberOfCakes(int numberOfCakes) {
        this.numberOfCakes = numberOfCakes;
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
