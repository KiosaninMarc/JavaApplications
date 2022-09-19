package entities;

public class Account {
	private int number;
	private String holder;
	private double depInit;
	
	//Init Constructor
	public Account(int number, String holder, double depInit) {
		this.number = number;
		this.holder = holder;
		balance(depInit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}//End Constructor
	
	//Init Getters and Setters
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDepInit() {
		return depInit;
	}//End Getters and Setters
	
	//Metodos
	public void balance(double depInit) {
		this.depInit += depInit;
	}
	
	public void withdraw(double depInit) {
		this.depInit -= depInit + 5.0;
	}
	
	public String toString() {
		return "Account "
			+ number 
			+ ", Holder: "
			+ holder
			+ ", Balance: $"
			+ String.format("%.2f", depInit);
	}
}
