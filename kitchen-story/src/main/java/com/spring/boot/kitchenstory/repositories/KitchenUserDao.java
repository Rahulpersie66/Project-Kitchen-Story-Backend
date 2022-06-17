package com.spring.boot.kitchenstory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.kitchenstory.entities.KitchenUserRegistered;

@Repository
public interface KitchenUserDao extends JpaRepository<KitchenUserRegistered, Integer> {
//all basic CRUD operation
}
