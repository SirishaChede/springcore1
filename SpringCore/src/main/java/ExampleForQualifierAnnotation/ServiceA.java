package ExampleForQualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("serviceA")
public class ServiceA implements Service{
	
	public void display() {
		System.out.println("this is first service");
	}

}
