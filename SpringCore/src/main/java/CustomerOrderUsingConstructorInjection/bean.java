package CustomerOrderUsingConstructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean {
	@Bean
	public Customer customer() {
		Customer customer=new Customer("siri",10);
		return customer;
	}
	@Bean
	public Order order() {
		Order order=new Order("10","pen",customer());
		return order;
	}

}
