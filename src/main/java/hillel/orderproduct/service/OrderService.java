package hillel.orderproduct.service;

import hillel.orderproduct.entity.Order;
import hillel.orderproduct.entity.Product;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer id);
    List<Order> getAllOrders();
    void addOrder(Order order);
}
