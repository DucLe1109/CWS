package com.example.cswfinal.repository;

import com.example.cswfinal.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

}
