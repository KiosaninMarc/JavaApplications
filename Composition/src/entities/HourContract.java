package entities;

import java.util.Date;

public class HourContract {
	private Date date; //Data do contrato
	private Double valuePerHour; //Valor ganho por hora
	private Integer hours; //Horas trabalhadas
	
	//Contructors
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	//Getters and Setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	//Methods
	public double totalValue() {
		//Metodo para multiplicar o valor por hora pelas horas trabalhadas
		return valuePerHour * hours;
	}
}
