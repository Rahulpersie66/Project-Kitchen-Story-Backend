package com.spring.boot.kitchenstory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.kitchenstory.entities.KitchenProduct;

@Repository
public interface KitchenProductDao extends JpaRepository<KitchenProduct, Integer> {
//CRUD opperation for products
}
