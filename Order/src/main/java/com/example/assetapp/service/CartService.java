package com.example.assetapp.service;

import com.example.assetapp.data.Cart;
import com.example.assetapp.data.CartRepository;
import com.example.assetapp.data.Order;
import com.example.assetapp.data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service

public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart createCart(Cart cart) {

        // Save the order to the database
        Cart savedCart = cartRepository.save(cart);
        // Return the saved order
        return savedCart;
    }
}
