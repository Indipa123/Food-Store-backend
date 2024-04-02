package com.example.assetapp.controller;
import com.example.assetapp.data.Order;
import com.example.assetapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping(path = "/get")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    @PostMapping(path = "/create")
    public ResponseEntity<Order> createOrders(@RequestBody Order order) {
        Order createdOrder = orderService.createOrders(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
    @GetMapping(path = "/orders/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
    @DeleteMapping(path = "/orders/{id}")
    public void deleteOrderById(@PathVariable int id){
        orderService.deleteOrder(id);
    }
    @PutMapping(path = "/orders")
    public Order updateOrderById(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

}
