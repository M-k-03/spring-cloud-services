/**
 * 
 */
package com.muthu.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.springcloud.model.Coupon;

/**
 * @author Muthu
 *
 */
public interface CouponInterface extends JpaRepository<Coupon, Long> {

	public Coupon findByCode(String code);

}
