package com.muthu.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.springcloud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
