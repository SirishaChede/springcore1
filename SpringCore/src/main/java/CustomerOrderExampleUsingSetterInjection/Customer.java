package CustomerOrderExampleUsingSetterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
     private String name;
	
     private String address;
	
     private String mobileno;
	
	
 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


@Override
 public String toString() {
	return "Customer{name='" + name + "', address='" + address + "', contact='" + mobileno + "'}";
	 
 }
 
		
	}


