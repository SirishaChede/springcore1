package SingletoneScopeExample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="singleton")
public class Student implements College{
	private String Qualification;
	public void Display() {
		System.out.println("students class");
		
	}
	@Override
	public String toString() {
		return "Student [Qualification=" + Qualification + "]";
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	
	
	

}
