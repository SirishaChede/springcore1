package CustomerOrderExampleUsingSetterInjection;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int orderid;
	
	private String Productname;
	
	private Date date;
	
	private Customer customer;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		 return "Order{orderId='" + orderid + "', productName='" + Productname + "', date=" + date + ", customer=" + customer + "}";
		
	}
	
	
	

}
