package ExampleforQualifierAnnotationUsingConstrutor;

import org.springframework.stereotype.Component;

@Component("serviceA")
public class ServiceA implements Service{

	@Override
	public void displayService() {
		// TODO Auto-generated method stub
		System.out.println("this is service A method");
		
	}

}
