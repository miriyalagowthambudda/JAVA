
public class Employee {
	private String name;
	private String address;
	private String mobile;
	
	public Employee(String name,String address,String mobile) {
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	

	public String getName() {
		return name;
		//System.out.println("name:" +name);
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	
	
	
}
