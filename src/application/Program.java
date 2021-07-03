package application;

import java.util.Scanner;

import model.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		//Authors: JOAO VITOR SOUZA PIONER & VITOR HUGO
		//Date: 30/06/2021 | Last edition: 
		
		Scanner input = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.inicializa("CLAUDIO", 8000.00);
		
		funcionario1.setHorasExtras(funcionario1.addHorasExtras(5));
		
		System.out.println(funcionario1.calculaSalarioFinal());
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getHorasExtras());
		System.out.println(funcionario1.getSalario());
		
	}

}
/*


Você esta programando um sistema para uma empresa. Para tal, um dos elementos
que devemos programar é a ideia de um funcionário. Seguem os requisitos da classe:
atributos: nome (string), horasExtras (inteiro) e salario (double)
métodos: 
inicializa() –> recebe uma String e um double para inicializar os atributos da
classe. O atributo horasExtras é inicializado com zero. 
 addHorasExtras() –> recebe um inteiro e incrementa em horas extras, desde
que o valor passado como parâmetro seja positivo.
 calculaSalarioFinal() –> retorna um double referente ao salário base mais 1% do
salário para cada hora extra trabalhada. Por exemplo, caso o funcionário tenha
trabalhado 20 horas extras ele vai receber 120% do seu salário.
 paraString() –> para facilitar a impressão, esse método retorna uma String com
as informações sobre o funcionário (seus atributos). A String deve estar no
seguinte formato: “Nome: <nome>, salario: <salario>, horas extras:
<horasExtras>”. Onde <nome> é o valor do atributo nome e assim por diante.
Exemplo: para funcionário com salário 1000, 2 horas extras e de nome “Zé”,
deve retornar: “Nome: Zé, salario: 1000,0, horas extras: 2”



*/
