package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Integer payDay;
	
	//Associações
	private Address address;	
	private List<Employee> employees = new ArrayList<Employee>();//Criação da lista Employee
	
	//Constructor
	public Department() {
	}

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//Methods
	public void addEmployee(Employee employee) {
		employees.add(employee);//Metodo para adicionar nome e salario na lista employees
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);//Metodo para remover nome e salario na lista employees
	}
	
	public double payroll() {
		double sum = 0.0;
		for (Employee empl : employees) {
			sum += empl.getSalary();
		}
		return sum;
	}//metodo para somar a folha de pagamento do departamento
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Employee e : employees) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}//Metodo para exibir o nome dos funcionarios na lista
	
}
