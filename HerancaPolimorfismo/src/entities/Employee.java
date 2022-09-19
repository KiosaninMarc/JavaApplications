package entities;

public class Employee {
	private String name;
	private Integer hour;
	private Double valuePerHour;
	
	//Constructors
	public Employee() {
	}
	
	public Employee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHour() {
		return hour;
	}
	
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//Methods
	public double payment() {
		return hour * valuePerHour;
	}
}
