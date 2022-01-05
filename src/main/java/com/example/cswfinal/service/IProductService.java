package com.example.cswfinal.service;

import com.example.cswfinal.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity p);
    ProductEntity sellProduct(int productid, int quantity);
    ProductEntity findProduct(int productid);
}
