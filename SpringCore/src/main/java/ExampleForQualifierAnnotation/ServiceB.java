package ExampleForQualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("serviceB")
public class ServiceB implements Service{

	public void display() {
		System.out.println("this is service b class");
	}

}
