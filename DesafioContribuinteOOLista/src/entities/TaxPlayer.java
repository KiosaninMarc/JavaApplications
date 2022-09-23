package entities;

public class TaxPlayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	//Constructors
	public TaxPlayer() {
	}
	
	public TaxPlayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	//End Constructors

	//Getters and Setters
	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	//End Getters and Setters
	
	//Methods
	public double salaryTax() {
		if (salaryIncome >= 36000.0 && salaryIncome <= 60000.0 ) {
			return salaryIncome * 0.10;
		}else if(salaryIncome > 60000.0) {
			return salaryIncome * 0.20;
		}else {
			return 0.0;
		}
	}
	
	public double servicesTax() {
		if (servicesIncome > 0.0) {
			return servicesIncome * 0.15;
		}else {
			return 0.0;
		}
	}
	
	public double capitalTax() {
		if (capitalIncome > 0.0) {
			return capitalIncome * 0.20;
		}else {
			return 0.0;
		}
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		if (healthSpending + educationSpending > grossTax()) {
			return grossTax() * 0.30;
		}else {
			return healthSpending + educationSpending;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	@Override
	public String toString() {
		return "Imposto bruto total: "
			+ String.format("%.2f", grossTax())
			+ "\nAbatimento: "
			+ String.format("%.2f", taxRebate())
			+ "\nImposto devido: "
			+ String.format("%.2f", netTax());
	}
	
}
