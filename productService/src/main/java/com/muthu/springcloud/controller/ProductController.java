package com.muthu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.springcloud.model.Coupon;
import com.muthu.springcloud.model.Product;
import com.muthu.springcloud.repo.CouponClient;
import com.muthu.springcloud.repo.ProductRepository;

@RestController
@RequestMapping("productapi")
public class ProductController {

	@Autowired
	CouponClient couponClient;
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponClient.getCoupon(product.getCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return productRepository.save(product);
	}
}
