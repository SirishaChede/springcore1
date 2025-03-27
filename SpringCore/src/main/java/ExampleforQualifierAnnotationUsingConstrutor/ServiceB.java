package ExampleforQualifierAnnotationUsingConstrutor;

import org.springframework.stereotype.Component;

@Component("serviceB")
public class ServiceB implements Service {

	@Override
	public void displayService() {
		// TODO Auto-generated method stub
		System.out.println("this is service b");
		
	}
	

}
