package ExampleForPrimaryAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	@Autowired
	private  Service service;
	
	public void Clientdisplay() {
		service.displayService();
	}
	
	

}
