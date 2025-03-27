package AutowiredAnnotationExample;

public class Address {
	private int doorno;
	private String villagename;
	private int pincode;
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getVillagename() {
		return villagename;
	}
	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	} 
	@Override
	public String toString() {
		return "#"+doorno+","+villagename+","+pincode;
	}

}
