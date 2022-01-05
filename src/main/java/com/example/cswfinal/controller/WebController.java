package com.example.cswfinal.controller;

import com.example.cswfinal.entity.ProductEntity;
import com.example.cswfinal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        return "add";
    }

    @GetMapping("/update")
    public String update(Model model, @RequestParam int id) {
        ProductEntity p = productService.findProduct(id);
        model.addAttribute("p",p);
        return "update";
    }
}
