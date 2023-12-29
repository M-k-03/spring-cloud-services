/**
 * 
 */
package com.muthu.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.springcloud.model.Coupon;
import com.muthu.springcloud.repo.CouponInterface;

/**
 * @author Muthu
 *
 */
@RestController
@RequestMapping("couponapi")
public class CouponController {

	@Autowired
	CouponInterface couponInterface;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return couponInterface.save(coupon);
	}
	
	@RequestMapping(value="/coupon/{code}/getCoupon")
	public Coupon getCoupon(@PathVariable String code) {
		return couponInterface.findByCode(code);
	}
	
}
