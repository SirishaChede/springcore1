package BeanLifeCycleMethods;


	import org.springframework.beans.factory.BeanNameAware;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.ApplicationContextAware;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
	

	public class Customer implements BeanNameAware,ApplicationContextAware  {
	    
	    private String name;
	    private Order order;

	    // Constructor for dependency injection
	    public Customer(Order order) {
	        this.order = order;
	    }

	    // Setter for name (dependency injection can also be done here)
	    public void setName(String name) {
	        this.name = name;
	    }

	   @PostConstruct
	    public void init() {
	        System.out.println("Customer bean initialized with name: " + name);
	    }

	   @PreDestroy
	    public void cleanup() {
	        System.out.println("Customer bean is being destroyed.");
	    }

	    @Override
	    public void setBeanName(String name) {
	        System.out.println("Customer bean name: " + name);
	    }

	    @Override
	    public void setApplicationContext(ApplicationContext context) {
	        System.out.println("ApplicationContext for Customer: " + context);
	    }

	    public void placeOrder() {
	        order.createOrder();
	        System.out.println(name + " placed an order.");
	    }
	}



