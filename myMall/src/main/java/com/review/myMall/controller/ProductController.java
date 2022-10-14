package com.review.myMall.controller;

import com.review.myMall.module.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class ProductController {
    private static final Logger log= LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/login")
    public String login(){
        log.info("user login");
        return "index";
    }


    @RequestMapping("/add")
    public String createProduct(@RequestBody Product request){

        Product pt=new Product();
        pt.setId(request.getId());
        pt.setName(request.getName());
        pt.setImgURL(request.getImgURL());
        pt.setPrice(request.getPrice());
        pt.setStock(request.getStock());
        log.info(pt.toString());
        log.info("createProduct entered");
        return "index";
    }


}
