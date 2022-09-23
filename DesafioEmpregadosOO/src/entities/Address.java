package entities;
//Classe de email e telefone do departamento

public class Address {
	private String email;
	private String phone;
	
	//Constructors
	public Address() {
	}
	
	public Address(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}

	//Getters and Setters
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
	
}
