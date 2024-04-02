package com.example.assetapp.service;
import com.example.assetapp.data.Order;
import com.example.assetapp.data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order createOrders(Order order) {
        // Set default values for null fields

        if (order.getZipcode() == null) {
            order.setZipcode(12345);
        }

        // Save the order to the database
        Order savedOrder = orderRepository.save(order);

        // Return the saved order
        return savedOrder;
    }
    public Order getOrderById(int id){
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()){
            return order.get();
        }
        return null;
    }
    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }
    public void deleteOrder(int id){
        orderRepository.deleteById(id);
    }


}
