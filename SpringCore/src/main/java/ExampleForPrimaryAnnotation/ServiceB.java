package ExampleForPrimaryAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("serviceB")
@Primary
public class ServiceB implements Service {

	@Override
	public void displayService() {
		// TODO Auto-generated method stub
		System.out.println("this is service B class");
		
	}

}
