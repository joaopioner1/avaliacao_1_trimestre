package model.entities;

public class Funcionario {
	
	private String nome;
	private Integer horasExtras;
	private Double salario;
	
	//Funciona como um construtor
	public void inicializa(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
		this.horasExtras = 0;
	}
	
	public Integer addHorasExtras(Integer horas) {
		return horasExtras += horas;
	}
	
	public Double calculaSalarioFinal() {
		double percentage = horasExtras;
		//double result = salario * percentage + salario;
		return percentage;
	}
	
	
	//Getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}