package PrototypeScopeExample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Student {
	private String qualification; 
    public void display() {
    	System.out.println("School class");
    }
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Student [qualification=" + qualification + "]";
	}
	
    
}
