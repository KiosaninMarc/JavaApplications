package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	//Constructors
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//Getters and Setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//Methods
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
}
