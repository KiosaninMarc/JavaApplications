package entities;
//Classe de nome e salario dos empregados

public class Employee {
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Methods
	public String toString() {
		return name;
	}
	
	
}
