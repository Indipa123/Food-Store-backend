package com.example.assetapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
