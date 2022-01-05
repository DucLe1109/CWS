package com.example.cswfinal.controller;

import com.example.cswfinal.entity.ProductEntity;
import com.example.cswfinal.model.BaseResponse;
import com.example.cswfinal.service.IProductService;
import com.example.cswfinal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity getAllProduct() {
        BaseResponse<List<ProductEntity>> response = new BaseResponse<>();
        response.data = productService.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    private ResponseEntity addNewProduct(@RequestBody ProductEntity item) {
        productService.addProduct(item);
        return ResponseEntity.ok(item);
    }

    @PutMapping
    private ResponseEntity updateProduct(@RequestParam Map<String, String> allParam) {
        int product_id = Integer.parseInt(allParam.get("productId"));
        int quantity = Integer.parseInt(allParam.get("quantity"));
        return ResponseEntity.ok(productService.sellProduct(product_id,quantity));
    }

    @PostMapping("/update")
    private ResponseEntity updateProduct2(@RequestParam Map<String, String> allParam) {
        int product_id = Integer.parseInt(allParam.get("productId"));
        int quantity = Integer.parseInt(allParam.get("quantity"));
        return ResponseEntity.ok(productService.sellProduct(product_id,quantity));
    }
}
