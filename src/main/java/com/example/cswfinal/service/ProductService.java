package com.example.cswfinal.service;

import com.example.cswfinal.entity.ProductEntity;
import com.example.cswfinal.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity addProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public ProductEntity sellProduct(int productid, int quantity) {
        ProductEntity p = productRepo.findById(productid).get();
        p.setQuantity(p.getQuantity() - quantity);
        productRepo.save(p);
        return p;
    }

    @Override
    public ProductEntity findProduct(int productid) {
        ProductEntity p = productRepo.findById(productid).get();
        return p;
    }

}
