package ExampleforQualifierAnnotationUsingConstrutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Client {
	
	
	private Service service;
	@Autowired
	public Client(@Qualifier("serviceA")Service service) {
		super();
		this.service = service;
	}
    
    public void display() {
    	service.displayService();
    }
	
	

}
