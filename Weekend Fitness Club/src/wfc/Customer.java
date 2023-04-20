package wfc;

public class Customer 
{
	private String name;
	private String email;
	private String phone;
	
	public Customer() {}
	
	public Customer(String name, String email, String phone) 
	{
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer Details:\nName: " + this.getName() + 
				", Email: " + this.getEmail() + 
				", Phone: " + this.getPhone();
	}
	
	
}
