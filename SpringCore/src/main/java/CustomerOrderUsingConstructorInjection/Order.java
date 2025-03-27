package CustomerOrderUsingConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
	
	private String orderId;
	private String ProductName;
	
	private Customer customer;
	@Autowired
	public Order(String orderId,String ProductName,Customer customer) {
	this.orderId=orderId;
	this.ProductName=ProductName;
	this.customer=customer;
	
}
@Override
public  String toString() {
	return orderId+","+ProductName+","+customer;
	
	
	
}
}
