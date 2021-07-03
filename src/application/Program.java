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


Voc� esta programando um sistema para uma empresa. Para tal, um dos elementos
que devemos programar � a ideia de um funcion�rio. Seguem os requisitos da classe:
atributos: nome (string), horasExtras (inteiro) e salario (double)
m�todos: 
inicializa() �> recebe uma String e um double para inicializar os atributos da
classe. O atributo horasExtras � inicializado com zero. 
 addHorasExtras() �> recebe um inteiro e incrementa em horas extras, desde
que o valor passado como par�metro seja positivo.
 calculaSalarioFinal() �> retorna um double referente ao sal�rio base mais 1% do
sal�rio para cada hora extra trabalhada. Por exemplo, caso o funcion�rio tenha
trabalhado 20 horas extras ele vai receber 120% do seu sal�rio.
 paraString() �> para facilitar a impress�o, esse m�todo retorna uma String com
as informa��es sobre o funcion�rio (seus atributos). A String deve estar no
seguinte formato: �Nome: <nome>, salario: <salario>, horas extras:
<horasExtras>�. Onde <nome> � o valor do atributo nome e assim por diante.
Exemplo: para funcion�rio com sal�rio 1000, 2 horas extras e de nome �Z�,
deve retornar: �Nome: Z�, salario: 1000,0, horas extras: 2�



*/
