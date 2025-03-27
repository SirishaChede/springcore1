package ExampleforLazyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class Order {
	private String ordername;
	@Autowired
	@Lazy
	private Customer customer;
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [ordername=" + ordername + ", customer=" + customer + "]";
	}
	public void displayOrderInfo() {
        System.out.println(this.toString());
	}
	

}
