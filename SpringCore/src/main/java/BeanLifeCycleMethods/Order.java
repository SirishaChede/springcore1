package BeanLifeCycleMethods;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Order {
	    
	    private int orderId;
	    private String product;

	    // Constructor for dependency injection
	    public Order(int orderId, String product) {
	        this.orderId = orderId;
	        this.product = product;
	    }

	    @PostConstruct
	    public void init() {
	        System.out.println("Order bean initialized with order ID: " + orderId);
	    }

	    @PreDestroy
	    public void cleanup() {
	        System.out.println("Order bean is being destroyed.");
	    }

	    public void createOrder() {
	        System.out.println("Creating order for product: " + product);
	    }
	}



