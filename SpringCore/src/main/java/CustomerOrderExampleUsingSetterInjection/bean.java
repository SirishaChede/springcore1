package CustomerOrderExampleUsingSetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class bean {
	@Bean
	public Customer cust() {
		Customer cus=new Customer();
		cus.setName("siri");
		
		cus.setAddress("hyderabad");
		cus.setMobileno("3744749");
		return cus;
		
	}
	@Bean
	public Order ord() {
		Order order=new Order();
		order.setDate(new java.util.Date());
		order.setOrderid(2535);
		order.setProductname("pen");
		order.setCustomer(cust());
		return order;
		

}
}
