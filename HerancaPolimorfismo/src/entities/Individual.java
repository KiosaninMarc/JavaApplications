package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	//Constructors
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	//Getters and Setters
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	//Methods
	@Override
	public double tax() {
		double calc = 0.0;
		if (getAnualIncome() < 20000.0) {
			if(getHealthExpenditures() > 0.0) {
				calc = ((getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5));
			}else {
				calc = getAnualIncome() * 0.15;
			}
		}else {
			if (getHealthExpenditures() > 0.0) {
				calc = ((getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5));
			}else {
				calc = getAnualIncome() * 0.25;
			}
		}
		return calc;
	}

}
