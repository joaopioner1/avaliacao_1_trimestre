package application;

import model.entities.Funcionario;

public class TesteFuncionario {
	static int testes=0;
	static double acertos=0;
	
	static void teste(boolean test) {
		testes++;
		if (test) acertos++;
		System.out.println("Teste "+testes+": "+test);
	}
	static void resultadoFinal(){
		System.out.println("acertos:"+acertos+" nota:"+(acertos*10/testes));
	}	
	public static void main(String[] args) {
	
		Funcionario func = new Funcionario();
		func.inicializa("Jorge Souza", 10000);
		teste(func.nome.equals("Jorge Souza"));
		teste(func.salario==10000);
		teste(func.horasExtras==0);
		teste(func.calculaSalarioFinal()==10000);
		
		func.addHorasExtras(5);
		func.addHorasExtras(5);
		func.addHorasExtras(-5);
		
		teste(func.horasExtras==10);
		teste(func.calculaSalarioFinal()==11000);
		teste(func.paraString().equals(
				"Nome: Jorge Souza, salario: 10000.0, horas extras: 10"));
		resultadoFinal();
	}
}
