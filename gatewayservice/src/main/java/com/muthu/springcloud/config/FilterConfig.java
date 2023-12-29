/**
 * 
 */
package com.muthu.springcloud.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.muthu.springcloud.filter.CustomFilter;

/**
 * @author Muthu
 *
 */
@Configuration
public class FilterConfig {

	/*@Bean
	public GlobalFilter customFilter() {
		return new CustomFilter();
	}*/

}
