package model.repository;


import model.entity.Order;

import java.util.List;

public interface OrderDA {

    void insertToDB(Order order);
    void updateDB(Order order);
    void delete(Order order);
    List<Order> selectAll();

}
