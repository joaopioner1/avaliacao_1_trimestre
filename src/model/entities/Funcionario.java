package model.entities;


public class Funcionario {
	
	public String nome;
	public Integer horasExtras;
	public Double salario;
	
	//Funciona como um construtor
	public void inicializa(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		this.horasExtras = 0;
	}
	
	public Integer addHorasExtras(Integer horas) {
		if (horas < 0) {
			return 0;
		}
		return horasExtras += horas;
	}
	
	public Double calculaSalarioFinal() {
		return horasExtras * salario / 100 + salario;
	}
	
	public String paraString() {
		return "Nome: " + nome + ", salario: " 
		+ salario + ", horas extras: " + horasExtras;
	}
}