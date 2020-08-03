package model.entity.products;

import model.entity.Entities;

import java.util.List;

public class Product extends Entities {


    private Long price;
    private int numberOfProduct;
    private List<Product> list;



    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }


}
