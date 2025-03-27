package BeanLifeCycleMethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	
	
	    @Bean
	    public Order order() {
	        return new Order(1, "Laptop");
	    }

	    @Bean
	    public Customer customer() {
	        Customer customer = new Customer(order());
	        customer.setName("John Doe");
	        return customer;
	    }
	}



