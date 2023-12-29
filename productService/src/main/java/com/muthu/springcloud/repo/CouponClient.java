package com.muthu.springcloud.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.muthu.springcloud.model.Coupon;

@FeignClient("GATEWAY-SERVICE")
public interface CouponClient {
	@GetMapping(value="/couponapi/coupon/{code}/getCoupon")
	Coupon getCoupon(@PathVariable("code") String code);

}
