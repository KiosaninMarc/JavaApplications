package entities;
//Classe Worker tem 1 departamento e varios contratos

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//Associações
	private Department department; //Crio a associação
	private List<HourContract> contracts = new ArrayList<>(); //Lista(Nao se coloca no CONSTRUCTOR) se instancia
	
	//Constructors - nao se coloca nada que seja lista
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	/*setContracts() removido para que nao seja criada outra lista na lista ja criada */
	public List<HourContract> getContracts() {
		return contracts;
	}

	//Methods
	public void addContract(HourContract contract) {
		//Metodo para associar um contrato ao trabalhador - adiciona o contrato à lista
		contracts.add(contract); 
	}
	
	public void removeContract(HourContract contract) {
		//Metodo para remover um contrato anunciado aqui da lista de contratos do trabalhador
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		//Vai calcular quanto a pessoa ganhou baseada no ANO e no MES
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); //Peguei a data do contrato e defini como sendo a data do calendario cal
			int c_year = cal.get(Calendar.YEAR); //Pega o ano do contrato "c"
			int c_month = 1 + cal.get(Calendar.MONTH); //Pega o mes do contrato "c"
			if (year == c_year && month == c_month) {
				//para verificar se o contrato "c" é do mes e do ano indicado
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
