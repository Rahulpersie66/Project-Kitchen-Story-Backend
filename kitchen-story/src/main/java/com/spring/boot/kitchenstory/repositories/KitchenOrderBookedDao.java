package com.spring.boot.kitchenstory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.kitchenstory.entities.KitchenOrderBooked;

@Repository
public interface KitchenOrderBookedDao extends JpaRepository<KitchenOrderBooked, Integer> {
//alll basic method of the Crud operation
}
