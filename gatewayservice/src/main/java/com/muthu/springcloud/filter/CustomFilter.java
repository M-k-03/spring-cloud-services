/**
 * 
 */
package com.muthu.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * @author Muthu
 *
 */
@Component
public class CustomFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		  System.out.println( "---> custom global filter entry ---->" + exchange.getRequest());
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
        	System.out.println("<--- custom global filter exit <----" + exchange.getResponse());
        }));
	}

}
